/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cln.cdp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author p
 */
public class GerenciadorCalculo {

    Map<String, String> mapaOperandos;

    public GerenciadorCalculo() {
        mapaOperandos = new HashMap<>();
        mapaOperandos.put("soma", "+");
        mapaOperandos.put("subtracao", "-");
        mapaOperandos.put("multiplicacao", "*");
        mapaOperandos.put("divisao", "/");
    }

    public double realizaCalculo(String entrada) {
        Stack<Expressao> pilha = new Stack<>();
        for (String token : entrada.split(" ")) {
            if (mapaOperandos.containsValue(token)) {
                pilha.push(ComandoHandler.handle(token, p2l(pilha)));
            } else {
                Double valor = Double.valueOf(token);
                pilha.push(new ValorExpressao(valor));
            }
        }
        return pilha.pop().interpretar();
    }

    public List<Expressao> p2l(Stack<Expressao> pilha) {
        List<Expressao> lista = new ArrayList<>();
        while (!pilha.empty()) {
            lista.add(pilha.pop());
        }
        return lista;
    }

}
