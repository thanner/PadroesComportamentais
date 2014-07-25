package br.edu.ifes.sr.poo2.exercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T
 */
public class SensorExterno2 extends SensorExterno {

    private final String NOME_SENSOR = "se2";

    public SensorExterno2(
            ArCondicionado arCondicionado) {
        arCondicionado.adicionarHashTemperaturaExterna(NOME_SENSOR);
    }

    @Override
    public String getNome() {
        return NOME_SENSOR;
    }

}
