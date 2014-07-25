/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.app;

import br.edu.ifes.poo2.ciu.cci.Controlador;

/**
 *
 * @author Thanner
 */
public class App {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.realizaPergunta("5 2 +");
    }

}
