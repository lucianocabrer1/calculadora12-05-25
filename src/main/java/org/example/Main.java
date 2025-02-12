package org.example;

public class Main {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Division division = new Division();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        System.out.println("Suma " + suma.suma(10,20) + "\n" +
                "Resta " + resta.resta(20,10) +"\n" +
                "Multiplicacion " + multiplicacion.multiplicacion(2,5) +"\n" +
                "Division " + division.division(10,2) + "\n" );
    }
}