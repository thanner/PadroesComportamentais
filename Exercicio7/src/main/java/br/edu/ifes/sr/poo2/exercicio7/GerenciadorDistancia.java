/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author T
 */
public class GerenciadorDistancia {

    Map<String, Cidade> mapaCidades;

    public GerenciadorDistancia() {
        mapaCidades = new HashMap<>();
        mapaCidades.put("vitoria", new Cidade("Vitória", 20, 20));
        mapaCidades.put("serra", new Cidade("Serra", 30, 30));
        mapaCidades.put("colatina", new Cidade("Colatina", 150, 150));
        mapaCidades.put("pedroCanario", new Cidade("Pedro Canário", 250, 250));
    }

    public Cidade gerenciar(String entrada) {
        Stack<Expressao> pilha = new Stack<>();
        for (String token : entrada.split(" ")) {
            if (mapaCidades.containsKey(token)) {
                Cidade cidade = mapaCidades.get(token);
                pilha.push(new CidadeExpressao(cidade));
            } else {
                pilha.push(ComandoHandler.handle(token, stack2List(pilha)));
            }
        }
        return pilha.pop().interpretar();
    }

    private List<Expressao> stack2List(Stack<Expressao> pilha) {
        List<Expressao> lista = new ArrayList<>();
        while (!pilha.empty()) {
            lista.add(pilha.pop());
        }
        return lista;
    }

}
