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
public abstract class SensorInterno extends Observable {

    private int pessoas;

    public SensorInterno() {
        pessoas = 0;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
        setChanged();
        notifyObservers();
    }

    public abstract String getNome();

    public int getPessoas() {
        return pessoas;
    }
}
