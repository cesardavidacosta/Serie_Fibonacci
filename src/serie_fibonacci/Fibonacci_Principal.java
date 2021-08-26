/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_fibonacci;

import Fibonacci.Controller.Calculos;

/**
 *
 * @author cdaco
 */
public class Fibonacci_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calculos calculos = new Calculos();
        for (int i = 0; i <4; i++) {
            System.out.println("el numero segun la serie es: " + calculos.SerieFibonacci(i));
     
            System.out.println("el numero obtenido de la serie es primo: " + calculos.numprimo(i));

        }
    }
}
