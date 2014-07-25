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
public class DivisaoExpressao extends ComandoHandler implements Expressao {

    private List<Expressao> listaExpressao;

    @Override
    public double interpretar() {
        double valorAtual = 0.0;
        for (int indice = 0; indice < listaExpressao.size(); indice++) {
            double valor = listaExpressao.get(indice).interpretar();
            if (indice == listaExpressao.size() - 1) {
                valorAtual = valor / valorAtual;
            } else {
                if (valorAtual == 0.0) {
                    valorAtual = valor;
                } else {
                    valorAtual = valorAtual * valor;
                }
            }
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
        return "/";
    }
}
