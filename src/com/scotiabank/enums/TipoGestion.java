package com.scotiabank.enums;

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
