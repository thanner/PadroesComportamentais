/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio2;

import java.util.Observable;

/**
 *
 * @author T
 */
public abstract class SensorExterno extends Observable {

    private double temperatura;

    public SensorExterno() {
        temperatura = 0;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers();
    }

    public abstract String getNome();

    public double getTemperatura() {
        return temperatura;
    }
}
