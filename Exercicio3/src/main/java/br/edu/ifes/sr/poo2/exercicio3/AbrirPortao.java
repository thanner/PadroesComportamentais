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
public class AbrirPortao implements ControleRemoto {

    Portao portao;

    public AbrirPortao(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void executaComando() {
        portao.setSituacaoPortao(true);
    }

    @Override
    public void desfazComando() {
        portao.setSituacaoPortao(!portao.getSituacaoPortao());
    }

}
