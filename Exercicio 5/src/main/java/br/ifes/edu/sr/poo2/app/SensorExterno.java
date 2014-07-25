/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.sr.poo2.app;

import java.util.Observable;

/**
 *
 * @author T
 */
public abstract class SensorExterno extends Observable {

    private double temperatura;
    private final Mediador mediador;

    public SensorExterno(Mediador mediador) {
        temperatura = 0;
        this.mediador = mediador;
        mediador.adicionarHashTemperaturaExterna(getNome());
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        mediador.ajustarTemperatura(this);
    }

    public abstract String getNome();

    public double getTemperatura() {
        return temperatura;
    }
}
