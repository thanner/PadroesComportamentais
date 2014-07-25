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
public abstract class SensorInterno extends Observable {

    private int pessoas;
    private final Mediador mediador;

    public SensorInterno(Mediador mediador) {
        pessoas = 0;
        this.mediador = mediador;
        mediador.adicionarHashPessoas(getNome());
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
        mediador.ajustarTemperatura(this);
    }

    public abstract String getNome();

    public int getPessoas() {
        return pessoas;
    }
}
