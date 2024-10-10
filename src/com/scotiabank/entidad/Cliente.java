package com.scotiabank.entidad;

import com.scotiabank.enums.TipoGestion;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private int edad;
    private String documento;
    private String gestion;

    public Cliente(String nombre, int edad, String documento, TipoGestion gestion) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        //String.gestion = gestion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", documento='" + documento + '\'' + ", gestion=" + gestion + '}';
    }

    // Método para comparar los clientes por prioridad
    @Override
    public int compareTo(Cliente otroCliente) {
        int prioridadActual = this.obtenerPrioridad();
        int prioridadOtro = otroCliente.obtenerPrioridad();
        return Integer.compare(prioridadOtro, prioridadActual);
    }

    // Método para obtener la prioridad en función de la edad y gestión
    public int obtenerPrioridad() {
        if (edad >= 51) {
            return 5; // Atención preferencial por adulto mayor
        } else if (edad >= 26 && edad <= 50) {
            //return gestion.getPrioridad(); // Atención especializada
        } else if (edad >= 18 && edad <= 25) {
            //return gestion.getPrioridad(); // Consulta normal, depende de la gestión
        }
        return 0; // Sin prioridad
    }
}
