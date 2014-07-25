/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.exercicio1;

/**
 *
 * @author T
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        maquina.getState().insereMoeda();
        maquina.getState().acionarAlavanca();
        maquina.getState().entregarGoma();
        System.out.println("");
        maquina.getState().insereMoeda();
        maquina.getState().ejetaMoeda();
        System.out.println("");
        maquina.getState().insereMoeda();
        maquina.getState().acionarAlavanca();
        maquina.getState().informarAusenciaGomas();
    }

}
