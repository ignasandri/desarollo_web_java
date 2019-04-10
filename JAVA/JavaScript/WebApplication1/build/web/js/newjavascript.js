class Practica1 {

    main() {

        System.out.println("Hola Mundo!");

        var variableEntera = 10;
        var varDecial = 10.2022222222;
        var varDoblePrecision = 30.9999999999999;
        var varTexto = " Un texto ";
        var varBuleano = true;

        System.out.println("Variable: " + variableEntera);
        System.out.println("Variable: " + varDecial);
        System.out.println("Variable: " + varDoblePrecision);
        System.out.println("Variable: " + varTexto);
        System.out.println("Variable: " + varBuleano);

        System.out.println("----------------------- ");

        var contador = 0;

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
    
    calcularIVA(precio,iva){
        
        var resultado = precio + iva / 100* precio;
        return resultado;
    }

    aleatorio(){
        return Math.random();
    }
}

var miPrueba = new PruebasJava();
miPrueba.main();

