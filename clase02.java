package com.company;
/*
Programa de la clase numero 2
 */
public class clase02 {
// Declaracion de variables
        int num;
        char letra;
        double real;
        String hola;
        String nombre;


// Metodo que imprime algo
        void imprimir(){
            System.out.println("Clase # 2");
            System.out.println("Mi nombre -> " + nombre);
    }

    int resultado(int edad){
            int reult =0;
            reult = edad +5;
        return reult;


    }

    public static void main( String[] arg){
            // Estamos instanciando nuestro programa
        int temp;

        clase02 n1 = new clase02();
            n1.nombre = " Juan Carlos Otero";


            n1.imprimir();
        temp = n1.resultado( 10);
        System.out.println("El resultado es ->" +temp);


    }

}
