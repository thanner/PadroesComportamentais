/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio7;

import java.util.List;

/**
 *
 * @author T
 */
public class OesteExpressao extends ComandoHandler implements Expressao {

    private List<Expressao> listaCidades;

    @Override
    public Cidade interpretar() {
        Cidade cidadeAtual = new Cidade("", 1000, 1000);
        for (Expressao expressao : listaCidades) {
            Cidade novaCidade = expressao.interpretar();
            if (cidadeAtual.getLongitude() > novaCidade.getLongitude()) {
                cidadeAtual = novaCidade;
            }
        }
        return cidadeAtual;
    }

    @Override
    public Expressao processarAqui(List<Expressao> listaExpressao) {
        this.listaCidades = listaExpressao;
        return this;
    }

    @Override
    public String tipoExpressao() {
        return "oeste";
    }

}
