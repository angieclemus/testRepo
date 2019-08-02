package edu.upb.promg2.testrepo;

import java.util.Random;
import java.util.Scanner;

public class Juego 
{

    public static void main(String[] args) 
    {
        int contador=0;
        int num;
        int numAleatorio;
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();

        do 
        {
            System.out.println("Dame un número entre 1-20: ");

            num = Integer.parseInt(teclado.nextLine());
            numAleatorio = r.nextInt(20) + 1;
            if (num == numAleatorio) {
                System.out.println("Ganaste con el número: " + num);
            } else {
                System.out.println("Pailas al número correcto era: " + numAleatorio + "y no: " + num);
            }
            contador++;
        } 
        while (num != numAleatorio);
        System.out.println("Ganaste despues de " + contador );
    }
}
