/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cln.cdp;

import br.edu.ifes.poo2.cln.cdp.Expressao;

/**
 *
 * @author 20121BSI0325
 */
public class ValorExpressao implements Expressao {

    private final double valor;

    public ValorExpressao(double valor) {
        this.valor = valor;
    }

    @Override
    public double interpretar() {
        return valor;
    }

}
