/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio7;

/**
 *
 * @author 20121BSI0325
 */
public class Principal {

    public static void main(String[] args) {
        GerenciadorDistancia g = new GerenciadorDistancia();
        Cidade cidade = g.gerenciar("vitoria serra colatina pedroCanario norte");
        System.out.println(cidade.getNome());
    }

}
