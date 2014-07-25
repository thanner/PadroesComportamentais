/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.sr.poo2.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author T
 */
public class Mediador {

    private Map<String, SensorInterno> mapaSensorInterno;
    private Map<String, SensorExterno> mapaSensorExterno;
    private ArCondicionado arCondicionado;

    public void setSensorInterno(String nome, SensorInterno sensorInterno) {
        mapaSensorInterno.put(nome, sensorInterno);
    }

    public void setSensorExterno(String nome, SensorExterno sensorExterno) {
        mapaSensorExterno.put(nome, sensorExterno);
    }

    Map<String, Double> controleTemperaturaExterna;
    Map<String, Integer> controlePessoas;

    public Mediador() {
        this.controleTemperaturaExterna = new HashMap<>();
        this.controlePessoas = new HashMap<>();
    }

    public void defineArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void adicionarHashTemperaturaExterna(String nome) {
        controleTemperaturaExterna.put(nome, 0.0);
    }

    public void adicionarHashPessoas(String nome) {
        controlePessoas.put(nome, 0);
    }

    public void ajustarTemperatura(Observable o) {
        if (o.toString().contains("Externo")) {
            SensorExterno sensor = (SensorExterno) o;
            controleTemperaturaExterna.put(sensor.getNome(), sensor.getTemperatura());
        } else {
            SensorInterno sensor = (SensorInterno) o;
            controlePessoas.put(sensor.getNome(), sensor.getPessoas());
        }
        double temperaturaMedia = calculaTemperatura();
        if (temperaturaMedia < 25) {
            arCondicionado.aumentarTemperatura();
        } else if (temperaturaMedia > 25) {
            arCondicionado.diminuirTemperatura();
        } else {
            arCondicionado.permanecerTemperatura();
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
