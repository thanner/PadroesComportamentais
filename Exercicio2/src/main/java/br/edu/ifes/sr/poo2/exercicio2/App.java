/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio2;

/**
 *
 * @author T
 */
public class App {

    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();

        SensorExterno se1 = new SensorExterno1(arCondicionado);
        se1.addObserver(arCondicionado);
        se1.setTemperatura(20);

        SensorExterno se2 = new SensorExterno2(arCondicionado);
        se2.addObserver(arCondicionado);
        se2.setTemperatura(30);

        SensorExterno se3 = new SensorExterno3(arCondicionado);
        se3.addObserver(arCondicionado);
        se3.setTemperatura(30);

        SensorInterno si1 = new SensorInterno1(arCondicionado);
        si1.addObserver(arCondicionado);
        si1.setPessoas(3);

        SensorInterno si2 = new SensorInterno2(arCondicionado);
        si2.addObserver(arCondicionado);
        si2.setPessoas(4);

        SensorInterno si3 = new SensorInterno3(arCondicionado);
        si3.addObserver(arCondicionado);
        si3.setPessoas(5);
    }

}
