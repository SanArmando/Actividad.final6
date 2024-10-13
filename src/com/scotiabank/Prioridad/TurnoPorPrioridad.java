package com.scotiabank.operacion;

import com.scotiabank.enums.TipoGestion;
import com.scotiabank.scotiabank.Cliente;

import javax.swing.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class TurnoPrioridad {

    public static void main(String[] args) {
        Queue<Cliente> colaClientes = new PriorityQueue<>();
        boolean continuar = true;

        while (continuar) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String documento = JOptionPane.showInputDialog("Ingrese el documento del cliente:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
            boolean esEmbarazada = JOptionPane.showConfirmDialog(null,
                    "¿El cliente está embarazada?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

            String[] opciones = {"1. Caja / Apertura de producto", "2. Asesoría Comercial", "3. Reclamos, Quejas o Recursos"};
            int seleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione el tipo de gestión", "Gestión",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            TipoGestion tipoGestion = null;
            switch (seleccion) {
                case 0:
                    tipoGestion = TipoGestion.CAJA;
                    break;
                case 1:
                    tipoGestion = TipoGestion.ASESORIA_COMERCIAL;
                    break;
                case 2:
                    tipoGestion = TipoGestion.PQR;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Selección inválida");
                    continue;
            }

            Cliente cliente = new Cliente(nombre, documento, edad, esEmbarazada, tipoGestion);
            colaClientes.add(cliente);

            JOptionPane.showMessageDialog(null, "Turno asignado: " + cliente.getTurno());

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro cliente?", "Continuar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }

        while (!colaClientes.isEmpty()) {
            Cliente clienteAtendido = colaClientes.poll();
            JOptionPane.showMessageDialog(null, "Atendiendo a: " + clienteAtendido);
        }
    }
}