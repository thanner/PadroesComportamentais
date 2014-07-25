/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.poo2.exercicio6;

/**
 *
 * @author Thanner
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipoReproducao mp3 = new Mp3();
        mp3.reproduzir();

        TipoReproducao mp4 = new Mp4();
        mp4.reproduzir();

        TipoReproducao avi = new AVI();
        avi.reproduzir();
    }

}
