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
public class Portao {

    private boolean situacaoPortao;

    public Portao() {
        situacaoPortao = false;
    }

    public void setSituacaoPortao(boolean situacao) {
        this.situacaoPortao = situacao;
    }

    public boolean getSituacaoPortao() {
        return situacaoPortao;
    }

    public String informaSituacao() {
        if (situacaoPortao) {
            return "aberto";
        }
        return "fechado";
    }
}
