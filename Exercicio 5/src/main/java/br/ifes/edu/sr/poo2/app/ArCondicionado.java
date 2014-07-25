/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.sr.poo2.app;

/**
 *
 * @author T
 */
public class ArCondicionado {

    // Essa ligação poderia não existir (padrão entre sensores e mediador). 
    // Mas eventualmente o ar condicionado pode repassar informações para o mediador e deixei configurado
    private final Mediador mediador;

    public ArCondicionado(Mediador mediador) {
        this.mediador = mediador;
        mediador.defineArCondicionado(this);
    }

    public void aumentarTemperatura() {
        System.out.println("Aumentando temperatura");
    }

    public void diminuirTemperatura() {
        System.out.println("Diminuindo temperatura");
    }

    public void permanecerTemperatura() {
        System.out.println("Permanecendo temperatura");
    }
}
