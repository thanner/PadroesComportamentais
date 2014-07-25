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
public class Mp4 extends TipoReproducao {

    @Override
    public void carregarArquivoLegenda() {
        System.out.println("Arquivo e legenda do MP4 carregado");
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reprodução do MP4");
    }

    @Override
    public void finalizarReproducao() {
        System.out.println("Finalização da reprodução do MP4");
    }

}
