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
public class AVI extends TipoReproducao {

    @Override
    public void carregarArquivoLegenda() {
        System.out.println("Arquivo e legenda do AVI carregado");
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reprodução do AVI");
    }

    @Override
    public void finalizarReproducao() {
        System.out.println("Finalização da reprodução do AVI");
    }

}
