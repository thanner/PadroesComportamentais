/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio4;

/**
 *
 * @author T
 */
public class Pessoa {

    private ClasseIR calculoImposto;
    private double salario;

    public Pessoa(double salario) {
        this.salario = salario;
        if (salario < 1710.78) {
            calculoImposto = new Classe1();
        } else if (salario < 2563.91) {
            calculoImposto = new Classe2();
        } else if (salario < 3418.59) {
            calculoImposto = new Classe3();
        } else if (salario < 4271.59) {
            calculoImposto = new Classe4();
        } else {
            calculoImposto = new Classe5();
        }
    }

    public double getSalario() {
        return salario;
    }

    public double getImposto() {
        return calculoImposto.calculaImposto(salario);
    }

}
