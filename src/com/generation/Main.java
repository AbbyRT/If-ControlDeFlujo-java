package com.generation;

import java.util.Scanner; //se importa la clase scanner

public class Main {

    public static void main(String[] args) {
	// estructura if
//        if (condicion){
//
//        } else if(){
//
//        } else {
//
//        }

        /*Hay 2 maneras de comentar, esta es una*/
        //esta es otra:v
        Scanner sc = new Scanner(System.in); //scanner permite leer datos desde consola
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cuál es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();
        sc.nextLine();

        if (edad>=18){
            System.out.println("Felicidades, " + nombre + ", puedes votar :v");
        } else {
            System.out.println("Hola, " + nombre + " no puedes votar :v");


        }
         sc.close(); //para cerrar scanner y mejorar la memoria, si se trata de volver a usar no va a funcionar


    }
}
