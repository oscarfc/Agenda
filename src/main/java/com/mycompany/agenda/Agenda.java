/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class Agenda {

    private List<Appuntamento> appuntamenti;

    public Agenda() {
        appuntamenti = new ArrayList<>();
    }

    /**
     *
     * @param a
     */
    public void add(Appuntamento a) {
        appuntamenti.add(a);
    }

    /**
     *
     * @param id
     * @return Appuntamento
     */
    public Appuntamento find(int id) {
        Appuntamento ap = null;
        for (Appuntamento a : appuntamenti) {
            if (a.getId() == id) {
                ap = a;
                break;
            }
        }
        return ap;
    }

    /**
     *
     * @param ricerca contiene motivo
     * @return List<Appuntamento>
     */
    public List<Appuntamento> search(String ricerca) {
        List<Appuntamento> lap = new ArrayList<>();
        for (int i = 0; i < appuntamenti.size(); i++) {
            if ((appuntamenti.get(i).getPersona() != null && appuntamenti.get(i).getPersona().contains(ricerca))
                    || (appuntamenti.get(i).getMotivo() != null && appuntamenti.get(i).getMotivo().contains(ricerca))) {
                lap.add(appuntamenti.get(i));
            }
        }
        return lap;
    }

    /**
     *
     * @param id
     * @param a
     */
    public void update(int id, Appuntamento a) {
        appuntamenti.remove(id);
        appuntamenti.add(id, a);
    }

    /**
     *
     * @param id
     */
    public void delete(int id) {
        appuntamenti.remove(id);
    }

    public void stampa() {
        for (int i = 0; i < appuntamenti.size(); i++) {
            appuntamenti.get(i).toString();
        }
    }
}
