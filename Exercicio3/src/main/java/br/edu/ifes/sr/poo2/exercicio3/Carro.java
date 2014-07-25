/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio3;

/**
 *
 * @author T
 */
public class Carro {

    private boolean situacaoCarro;

    public Carro() {
        situacaoCarro = false;
    }

    public void setSituacaoCarro(boolean situacao) {
        this.situacaoCarro = situacao;
    }

    public boolean getSituacaoCarro() {
        return situacaoCarro;
    }

    public String informaSituacao() {
        if (situacaoCarro) {
            return "ligado";
        }
        return "desligado";
    }
}
