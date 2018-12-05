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
public class TesteLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        lampada1.setLamp(true);
        lampada2.setLamp(false);
        testaLampada(lampada1, lampada2);
    }

    private static void testaLampada(Lampada lampada1, Lampada lampada2) {
        if(lampada1.estaLigada() == true){
            System.out.println("A lâmpada 1 está ligada");
        }else{
            System.out.println("A lâmpada 1 está desligada");
        }
        
        if(lampada2.estaLigada() == true){
            System.out.println("A lâmpada 2 está ligada");
        }else{
            System.out.println("A lâmpada 2 está desligada");
        }
    }
    
}
