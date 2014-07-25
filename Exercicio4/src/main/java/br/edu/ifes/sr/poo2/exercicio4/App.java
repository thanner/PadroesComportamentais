/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio4;

/**
 *
 * @author Thanner
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1000);
        System.out.println("Pessoa 1 com salário: " + pessoa1.getSalario() + " e imposto: " + pessoa1.getImposto());
        Pessoa pessoa2 = new Pessoa(3000);
        System.out.println("Pessoa 1 com salário: " + pessoa2.getSalario() + " e imposto: " + pessoa2.getImposto());
        Pessoa pessoa3 = new Pessoa(5000);
        System.out.println("Pessoa 1 com salário: " + pessoa3.getSalario() + " e imposto: " + pessoa3.getImposto());
    }

}
