/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author T
 */
public class ArCondicionado implements Observer {

    HashMap<String, Double> controleTemperaturaExterna;
    HashMap<String, Integer> controlePessoas;

    public ArCondicionado() {
        this.controleTemperaturaExterna = new HashMap<>();
        this.controlePessoas = new HashMap<>();
    }

    public void adicionarHashTemperaturaExterna(String nome) {
        controleTemperaturaExterna.put(nome, 0.0);
    }

    public void adicionarHashPessoas(String nome) {
        controlePessoas.put(nome, 0);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o.toString().contains("Externo")) {
            SensorExterno sensor = (SensorExterno) o;
            controleTemperaturaExterna.put(sensor.getNome(), sensor.getTemperatura());
        } else {
            SensorInterno sensor = (SensorInterno) o;
            controlePessoas.put(sensor.getNome(), sensor.getPessoas());
        }
        double temperaturaMedia = calculaTemperatura();
        if (temperaturaMedia < 25) {
            System.out.println("Aumentar ar");
        } else if (temperaturaMedia > 25) {
            System.out.println("Diminuir ar");
        } else {
            System.out.println("Temperatura permanece constante");
        }
    }

    private double calculaTemperatura() {
        int pessoasMedia = calculaPessoasMedia();
        double temperaturaExternaMedia = calculaTemperaturaExternaMedia();
        return temperaturaExternaMedia - pessoasMedia;
    }

    private int calculaPessoasMedia() {
        int totalValores = 0;
        double pessoasTotal = 0;
        Collection<Integer> valoresPessoa = controlePessoas.values();
        for (Iterator it = valoresPessoa.iterator(); it.hasNext();) {
            pessoasTotal = pessoasTotal + (int) it.next();
            totalValores = totalValores + 1;
        }
        if (totalValores == 0) {
            return 0;
        }
        return (int) pessoasTotal / totalValores;
    }

    private double calculaTemperaturaExternaMedia() {
        int totalValores = 0;
        double temperaturaTotal = 0;
        Collection<Double> valoresTemperaturaExterna = controleTemperaturaExterna.values();
        for (Iterator it = valoresTemperaturaExterna.iterator(); it.hasNext();) {
            temperaturaTotal = temperaturaTotal + (double) it.next();
            totalValores = totalValores + 1;
        }
        if (totalValores == 0) {
            return 0;
        }
        return temperaturaTotal / totalValores;
    }
}
