package edu.upb.promg2.testrepo;

import java.util.Random;
import java.util.Scanner;

public class Juego 
{
    public static void main(String[] args) 
    {
        System.out.println("Dame un número entre 1-20: ");
        Scanner teclado = new Scanner(System.in);
        int num = Integer.parseInt(teclado.nextLine());
        
        Random r = new Random();
        int numAleatorio = r.nextInt(20)+1;
        
        if(num == numAleatorio)
        {
            System.out.println("Ganaste con el número: "+ num); 
        }
        else
        {
            System.out.println("Pailas al número correcto era " + numAleatorio + "y no " + num);
        }
    }
}
