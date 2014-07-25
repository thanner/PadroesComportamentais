/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cln.cdp;

import java.util.List;

/**
 *
 * @author 20121BSI0325
 */
public class SomaExpressao extends ComandoHandler implements Expressao {

    private List<Expressao> listaExpressao;

    @Override
    public double interpretar() {
        double valorAtual = 0.0;
        for (Expressao exp : listaExpressao) {
            double novoValor = exp.interpretar();
            valorAtual = valorAtual + novoValor;
        }
        return valorAtual;
    }

    @Override
    public Expressao processarAqui(List<Expressao> listaExpressao) {
        this.listaExpressao = listaExpressao;
        return this;
    }

    @Override
    public String tipoExpressao() {
        return "+";
    }
}
