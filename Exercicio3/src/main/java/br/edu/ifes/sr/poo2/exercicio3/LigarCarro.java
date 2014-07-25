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
public class LigarCarro implements ControleRemoto {

    Carro carro;

    public LigarCarro(Carro portao) {
        this.carro = portao;
    }

    @Override
    public void executaComando() {
        carro.setSituacaoCarro(true);
    }

    @Override
    public void desfazComando() {
        carro.setSituacaoCarro(!carro.getSituacaoCarro());
    }

}
