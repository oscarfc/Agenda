/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenda;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 *
 * @author tss
 */
public class GestioneAgenda {

    private Agenda agenda;

    public static void main(String[] args) {
        GestioneAgenda gAgenda = new GestioneAgenda();
        gAgenda.addAppuntamento();
        gAgenda.findAppuntamento();
    }

    private void addAppuntamento() {
        agenda.add(new Appuntamento(LocalDateTime.now(), "qwerty", "Mario", "asdfg"));
        agenda.add(new Appuntamento(LocalDateTime.now(), "qwerty", "Giuseppe", "asdfg"));
        agenda.add(new Appuntamento(LocalDateTime.now(), "qwerty", "Aldo", "asdfg"));
    }

    private void findAppuntamento() {
        Optional<Appuntamento> finded = agenda.find(2);
        if(finded.isEmpty()) {
            System.out.println("com.mycompany.agenda.GestioneAgenda.findAppuntamento()" + " APPUNTAMENTO NON TROVATO");
        }
        else {
            
        }
    }
}
