package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EXTERNA:
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1. Pesos colombianos" +"\n"+
                               "2. Pesos mexicanos" +"\n"+
                               "3. Bolivares Venezolanos" +"\n"+
                               "4. Salir ");
            System.out.println("Seleccione una opcion");
            Scanner sc = new  Scanner(System.in);
            char opcion = sc.next().charAt(0);

            switch(opcion){
                case '1': conversorDeMonedas (4104.02,"Pesos colombianos");
                break;
                case '2': conversorDeMonedas (17.08,"Pesos mexicanos");
                break;
                case '3': conversorDeMonedas (30.07,"Bolivares Venezolanos");
                break;
                case '4': System.out.println("Cerrando el programa");
                break EXTERNA;
                default: System.out.println("Opcion incorrecta");
                break;
            }
        }

    }

    static void conversorDeMonedas (double ValorUS, String pais) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de la moneda en %s:", pais);
        double cantidadMoneda = sc.nextDouble();

        double dolares = cantidadMoneda / ValorUS;
        dolares = (double) Math.round(dolares * 100d / 100);

        System.out.println("-------------------------");
        System.out.println("   Tienes:  $$    "+ dolares +" USD   $$     ");
        System.out.println("-------------------------");
    }

}