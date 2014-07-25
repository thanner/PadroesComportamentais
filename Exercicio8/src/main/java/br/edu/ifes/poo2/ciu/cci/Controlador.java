/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.ciu.cci;

import br.edu.ifes.poo2.ciu.cih.Tela;
import br.edu.ifes.poo2.cln.cdp.GerenciadorCalculo;

/**
 *
 * @author 20121BSI0325
 */
public class Controlador {

    GerenciadorCalculo g;
    Tela t;

    public Controlador() {
        this.t = new Tela();
        this.g = new GerenciadorCalculo();
    }

    public void realizaPergunta(String pergunta) {
        Double resultado = g.realizaCalculo(pergunta);
        t.imprimirTela(resultado);
    }
}
