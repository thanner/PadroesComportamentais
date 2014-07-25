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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Situacao carro: " + carro.informaSituacao());
        ControleRemoto ligarCarro = new LigarCarro(carro);
        ligarCarro.executaComando();
        System.out.println("Situacao carro: " + carro.informaSituacao());

        Portao portao = new Portao();
        System.out.println("Situação portão: " + portao.informaSituacao());
        ControleRemoto abrirPortao = new AbrirPortao(portao);
        abrirPortao.executaComando();
        System.out.println("Situação portão: " + portao.informaSituacao());
        abrirPortao.desfazComando();
        System.out.println("Situação portão: " + portao.informaSituacao());

    }

}
