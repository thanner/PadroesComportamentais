/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio6;

/**
 *
 * @author T
 */
public abstract class TipoReproducao {

    public abstract void carregarArquivoLegenda();

    public abstract void reproduzirVideo();

    public abstract void finalizarReproducao();

    public void reproduzir() {
        carregarArquivoLegenda();
        reproduzirVideo();
        finalizarReproducao();
    }
;

}
