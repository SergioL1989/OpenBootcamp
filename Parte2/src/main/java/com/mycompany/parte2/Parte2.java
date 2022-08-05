/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parte2;

/**
 *
 * @author SERGIO LEMUS
 */
public class Parte2 {
    public static void main(String[] args) {
        coche nPuerta = new coche();
        nPuerta.addPuerta();
        nPuerta.addPuerta();
        System.out.println(nPuerta.puerta);

    }
   
}
class coche {
    public int puerta = 2;

    public void addPuerta(){
        this.puerta++;
    }
}


