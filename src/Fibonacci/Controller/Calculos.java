/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci.Controller;
/**
 * Codigo para hallar numeros primos segun la serie fibonacci
 * version 1.0.1
 * @author cdaco
 */
public class Calculos {
    public int SerieFibonacci(int num) {
        if (num > 1) {
            return SerieFibonacci(num - 1) + (num - 2);
        } else if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        } else {
            System.out.println("el numero ingresado no es valido");
            return -1;
        }
    }
    public boolean numprimo(int num) {
        boolean numero = true;
        int divisor = 2;
        while ((numero) && (divisor != num)) {
            if ((num % divisor == 0)) {
                numero = false;
            } else {
                divisor++;
            }
        }
        return numero;
    }
}
