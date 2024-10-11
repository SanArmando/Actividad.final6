package com.scotiabank.enums;

/**
 *
 * @author USR-79M2
 */
public enum TipoGestion {
    CAJA(1), ASESORIACOMERCIAL(2), RECLAMOS(3);

    private final int prioridad;

    TipoGestion(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
