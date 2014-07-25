/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio7;

import java.util.List;

/**
 *
 * @author 20121BSI0325
 */
public interface ComandoHandlerInterface {

    public void setProximo(ComandoHandlerInterface comando);

    public Expressao processarExpressao(String token, List<Expressao> listaExpressao);
}
