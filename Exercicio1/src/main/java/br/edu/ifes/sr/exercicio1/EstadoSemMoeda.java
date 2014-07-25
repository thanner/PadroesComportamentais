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
public class EstadoSemMoeda implements EstadoMaquina {

    private Maquina maquina;

    public EstadoSemMoeda(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        System.out.println("Se encontra sem moeda e está inserindo moeda");
        maquina.setState(maquina.getEstadoRecebeuMoeda());
    }

    @Override
    public void ejetaMoeda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acionarAlavanca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entregarGoma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void informarAusenciaGomas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
