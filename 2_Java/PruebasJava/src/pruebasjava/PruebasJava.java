/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasjava;

import java.util.Random;


/* Comentario   */
/**
 *
 * @author German
 */
public class PruebasJava {

    static final float MI_PI = 3.1416f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
        contador = 0;
        while (contador < 10) {
            System.out.println("Contador vale: " + contador);
            // contador = contador + 1;
            // contador += 1;
            contador++;
        }
        if (contador < 10) {
            System.out.println("Menor que 10");
        } else if (contador == 10) {
            System.out.println("Igual a 10");
        } else if (contador < 20) {
            System.out.println("Menor q 20");
        } else {
            System.out.println("Mayor que 20");
        }
        String letra = "A".toLowerCase();
        switch (letra) {
            case "a":
                System.out.println("Letra A");
                break;
            case "b":
                System.out.println("Letra B");
                break;
            case "c":
                System.out.println("Letra C");
                break;
            default:
                System.out.println("Ni A, ni B, ni C");
                break;
        }
        losMismosEjemplos();
    }
    static void losMismosEjemplos() {   // No devuelve nada        
        for (int i = 5; i > 0; i++) {
            System.out.println("El cuadrado de " 
                    + i + " es " + i * i);
        }    
        System.out.println("IVA 10: " + calcularIVA(10, 21));
        System.out.println("IVA 20: " + calcularIVA(20, 21));
        System.out.println("IVA 30: " + calcularIVA(30, 21));
        for (int i = 0; i <5; i++)  {
            System.out.println(">> " + valorAleatorio());            
        }
        System.out.println("PI = " + Math.PI);
        System.out.println("PI = " + MI_PI);
    }
    
    static float calcularIVA(float precio, float iva) {
        float resultado = precio + iva / 100 * precio;
        return resultado;
    }
    static float valorAleatorio() {
        Random r = new Random();
        return r.nextFloat();
    }
    
}
