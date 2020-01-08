/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<Appuntamento> find(int id) {
        Optional<Appuntamento> result = Optional.empty();
        for (Appuntamento a : appuntamenti) {
            if (a.getId() == id) {
                result =  Optional.of(a);
                break;
            }
        }
        return result;
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
        delete(id);
        add(a);
    }

    /**
     *
     * @param id
     */
    public void delete(int id) {
        Optional<Appuntamento> result = find(id);
        if (result.isPresent()) {
            appuntamenti.remove(result.get());
        }
        else {
            throw new IllegalArgumentException("id non trovato");
        }
    }

    public void stampa() {
        for (int i = 0; i < appuntamenti.size(); i++) {
            appuntamenti.get(i).toString();
        }
    }
}
