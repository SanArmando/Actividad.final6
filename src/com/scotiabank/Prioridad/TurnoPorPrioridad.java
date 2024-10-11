
package com.scotiabank.Prioridad;


public class TurnoPorPrioridad {
    
    
    // Atributos de la clase
    private String tipoTurno;
    private String cliente;
    private String usuarioDiscapacidad;
    private String tipoCliente;
    
    // Constructor de la clase
    public TurnoPorPrioridad(String tipoTurno, String cliente, String usuarioDiscapacidad, String tipoCliente) {
        this.tipoTurno = tipoTurno;
        this.cliente = cliente;
        this.usuarioDiscapacidad = usuarioDiscapacidad;
        this.tipoCliente = tipoCliente;
    }
    
    // Métodos getter y setter para los atributos
    
    // Métodos para manejar los turnos según la prioridad
    public void atenderTurno() {
        if (this.esTurnoDePrioridad()) {
            System.out.println("Atendiendo turno de prioridad para el cliente: " + this.cliente);
        } else if (this.esTurnoNormal()) {
            System.out.println("Atendiendo turno normal para el cliente: " + this.cliente);
        } else if (this.esNuevoCliente()) {
            System.out.println("Atendiendo nuevo cliente: " + this.cliente);
        } else if (this.esClienteConDiscapacidad()) {
            System.out.println("Atendiendo cliente con discapacidad: " + this.cliente);
        } else {
            System.out.println("No se puede atender este tipo de turno.");
        }
    }
    
    // Métodos para verificar la prioridad de los turnos
    private boolean esTurnoDePrioridad() {
        return this.tipoTurno.equals("prioridad");
    }
    
    private boolean esTurnoNormal() {
        return this.tipoTurno.equals("normal");
    }
    
    private boolean esNuevoCliente() {
        return this.tipoCliente.equals("nuevo");
    }
    
    private boolean esClienteConDiscapacidad() {
        return this.usuarioDiscapacidad.equals("si");
    }
}
