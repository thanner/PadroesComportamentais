/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.sr.poo2.app;

/**
 *
 * @author Thanner
 */
public class App {

    public static void main(String[] args) {
        Mediador mediador = new Mediador();

        ArCondicionado arCondicionado = new ArCondicionado(mediador);

        SensorExterno se1 = new SensorExterno1(mediador);
        se1.setTemperatura(20);

        SensorExterno se2 = new SensorExterno2(mediador);
        se2.setTemperatura(30);

        SensorExterno se3 = new SensorExterno3(mediador);
        se3.setTemperatura(30);

        SensorInterno si1 = new SensorInterno1(mediador);
        si1.setPessoas(3);

        SensorInterno si2 = new SensorInterno2(mediador);
        si2.setPessoas(4);

        SensorInterno si3 = new SensorInterno3(mediador);
        si3.setPessoas(5);

    }

}
