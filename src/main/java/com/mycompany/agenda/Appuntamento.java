/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenda;

import java.time.LocalDateTime;

/**
 * Appuntamento deve essere immodificabile
 *
 *
 * @author tss
 */
public class Appuntamento {
    private static int counter = 1;
    private final int id;
    private final LocalDateTime quando;
    private String motivo;
    private String persona;
    private String luogo;

    public Appuntamento(LocalDateTime quando) {
        this(quando, null, null, null);
    }

    public Appuntamento(LocalDateTime quando, String motivo, String persona, String luogo) {
        this.id = counter++;
        this.quando = quando;
        this.motivo = motivo;
        this.persona = persona;
        this.luogo = luogo;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getQuando() {
        return quando;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getPersona() {
        return persona;
    }

    public String getLuogo() {
        return luogo;
    }

    @Override
    public String toString() {
        return "Appuntamento{" + "id=" + id + ", quando=" + quando + ", motivo=" + motivo + ", persona=" + persona + ", luogo=" + luogo + '}';
    }

}
