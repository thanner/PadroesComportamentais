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
public interface EstadoMaquina {

    public void insereMoeda();

    public void ejetaMoeda();

    public void acionarAlavanca();

    public void entregarGoma();

    public void informarAusenciaGomas();
}
