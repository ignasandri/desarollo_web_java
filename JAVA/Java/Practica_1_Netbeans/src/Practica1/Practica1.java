package Practica1;

import static java.lang.Math.random;
import java.util.Random;

public class Practica1 {

    public static void main(String[] args) {

        System.out.println("Hola Mundo!");

        int variableEntera = 10;
        float varDecial = 10.2022222222f;
        double varDoblePrecision = 30.9999999999999;
        String varTexto = " Un texto ";
        boolean varBuleano = true;

        System.out.println("Variable: " + variableEntera);
        System.out.println("Variable: " + varDecial);
        System.out.println("Variable: " + varDoblePrecision);
        System.out.println("Variable: " + varTexto);
        System.out.println("Variable: " + varBuleano);

        System.out.println("----------------------- ");

        int contador = 0;

        while (contador < 10) {
            contador++;
            System.out.println("Contador vale: " + contador);
           // contador = contador +1;
            // contador += 1;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("For vale: " + i);
        }

        if (contador < 10) {
            System.out.println("Es menor que 10");
        } else if (contador == 10) {
            System.out.println("Contador es 10");
        } else {
            System.out.println("Contador mayor que 10");
        }

        String letra = "B";

        switch (letra) {
            case "A":
                System.out.println("Opcion A");
                break;
            case "B":
                System.out.println("Opcion B");
                break;
            case "C":
                System.out.println("Opcion C");
                break;
            case "D":
                System.out.println("Opcion D");
                break;
        }
        
        System.out.println("Calcular iva de 600€ 21% " + calcularIVA(600, 21));
        System.out.println("Este es el nº aleatorio: " + aleatorio());
        
        
    }
    
    
    
    
    static float calcularIVA(float precio,float iva){
        
        float resultado = precio + iva / 100* precio;
        return resultado;
    }

    
   static int aleatorio(){
        Random r = new Random();
        return r.nextInt(10)+1; // Aleatorio del 1 al 10 el más uno es para que no salga el 0
    }
     
     
     
}
