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
    public int SerieFibonacci(int numero) {
        if (numero > 1) {
            return SerieFibonacci(numero - 1) + (numero - 2);
        } else if (numero== 1) {
            return 1;
        } else if (numero == 0) {
            return 0;
        } else {
            System.out.println("el numero ingresado no es valido");
            return -1;
        }
    }
    public boolean NumPrimo(int numero) {
        boolean num = true;
        int divisor = 2;
        while ((num) && (divisor != numero)) {
            if ((numero % divisor == 0)) {
                num = false;
            } else {
                divisor++;
            }
        }
        return num;
    }
}
