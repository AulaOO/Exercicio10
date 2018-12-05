/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Luis Guilherme
 */
public class Lampada {
    private boolean lamp;

    public Lampada() {
    }

    public Lampada(boolean lamp) {
        this.lamp = lamp;
    }

    public boolean getLamp() {
        return lamp;
    }

    public void setLamp(boolean lamp) {
        this.lamp = lamp;
    }

    
    public boolean estaLigada(){
        boolean lampada = false;
        if(lamp != false){
            lampada = true;
        }
        return lampada;
    }
    
}
