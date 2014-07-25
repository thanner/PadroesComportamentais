package br.ifes.edu.sr.poo2.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T
 */
public class SensorInterno2 extends SensorInterno {

    private final String NOME_SENSOR = "si2";

    public SensorInterno2(Mediador mediador) {
        super(mediador);
    }

    @Override
    public String getNome() {
        return NOME_SENSOR;
    }

}
