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
public abstract class ComandoHandler implements ComandoHandlerInterface {

    private ComandoHandlerInterface comando;

    @Override
    public void setProximo(ComandoHandlerInterface comando) {
        this.comando = comando;
    }

    public static Expressao handle(String token, List<Expressao> listaExpressao) {
        SomaExpressao somaExpressao = new SomaExpressao();
        SubtracaoExpressao subtracaoExpressao = new SubtracaoExpressao();
        MultiplicacaoExpressao multiplicacaoExpressao = new MultiplicacaoExpressao();
        DivisaoExpressao divisaoExpressao = new DivisaoExpressao();

        somaExpressao.setProximo(subtracaoExpressao);
        subtracaoExpressao.setProximo(divisaoExpressao);
        divisaoExpressao.setProximo(multiplicacaoExpressao);

        return somaExpressao.processarExpressao(token, listaExpressao);
    }

    @Override
    public Expressao processarExpressao(String token, List<Expressao> listaExpressao) {
        Expressao expressao = null;
        if (tipoExpressao().equals(token)) {
            expressao = processarAqui(listaExpressao);
        } else {
            expressao = comando.processarExpressao(token, listaExpressao);
        }
        return expressao;
    }

    public abstract Expressao processarAqui(List<Expressao> listaExpressao);

    public abstract String tipoExpressao();

}
