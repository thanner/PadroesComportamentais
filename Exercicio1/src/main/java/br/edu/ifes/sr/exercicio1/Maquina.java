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
public class Maquina {

    private EstadoMaquina estadoCorrente;
    private EstadoMaquina estadoSemMoeda;
    private EstadoMaquina estadoRecebeuMoeda;
    private EstadoMaquina estadoGomaVendida;
    private EstadoMaquina estadoGomasAcabaram;

    public Maquina() {
        estadoSemMoeda = new EstadoSemMoeda(this);
        estadoRecebeuMoeda = new EstadoRecebeuMoeda(this);
        estadoGomaVendida = new EstadoGomaVendida(this);
        estadoGomasAcabaram = new EstadoGomasAcabaram(this);
        setState(estadoSemMoeda);
    }

    public EstadoMaquina getEstadoSemMoeda() {
        return estadoSemMoeda;
    }

    public EstadoMaquina getEstadoRecebeuMoeda() {
        return estadoRecebeuMoeda;
    }

    public EstadoMaquina getEstadoGomaVendida() {
        return estadoGomaVendida;
    }

    public EstadoMaquina getEstadoGomasAcabaram() {
        return estadoGomasAcabaram;
    }

    public EstadoMaquina getState() {
        return estadoCorrente;
    }

    public void setState(EstadoMaquina estadoMaquina) {
        this.estadoCorrente = estadoMaquina;
    }

}
