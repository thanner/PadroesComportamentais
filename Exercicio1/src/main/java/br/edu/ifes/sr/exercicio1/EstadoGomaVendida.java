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
public class EstadoGomaVendida implements EstadoMaquina {

    private Maquina maquina;

    public EstadoGomaVendida(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insereMoeda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        System.out.println("Vendeu goma e esta entregando goma");
        maquina.setState(maquina.getEstadoSemMoeda());
    }

    @Override
    public void informarAusenciaGomas() {
        System.out.println("Vendeu a goma, mas gomas acabaram");
        maquina.setState(maquina.getEstadoGomasAcabaram());
    }

}
