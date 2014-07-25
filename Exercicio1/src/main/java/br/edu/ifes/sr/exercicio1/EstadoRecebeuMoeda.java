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
public class EstadoRecebeuMoeda implements EstadoMaquina {

    private Maquina maquina;

    public EstadoRecebeuMoeda(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Recebeu moeda e está ejetando moeda");
        maquina.setState(maquina.getEstadoSemMoeda());
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Recebeu moeda e está acionando alavanca");
        maquina.setState(maquina.getEstadoGomaVendida());
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
