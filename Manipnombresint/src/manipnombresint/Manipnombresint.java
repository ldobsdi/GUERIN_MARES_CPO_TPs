/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint;

import java.util.Scanner;

/**
 *
 * @author doria
 */
public class Manipnombresint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanneurClav;
        scanneurClav = new Scanner(System.in);
        int somme = 0;
        int difference = 0;
        int produit = 0;
        int quotint = 0;
        int reste = 0;
       
        System.out.println("Entrez le nombre 1");
        int nombre1 = scanneurClav.nextInt();
        System.out.println("Entrez le nombre 2");
        int nombre2 = scanneurClav.nextInt();
        
        somme = nombre1+nombre2;
        difference = nombre1-nombre2;
        produit = nombre1*nombre2;
        quotint = nombre1/nombre2;
        reste = nombre1%nombre2;
        
        System.out.println("La somme des deux nombres est: "+somme);
        System.out.println("La différence entre ces deux nombres est: "+difference);
        System.out.println("Le produit des deux nombres est: "+produit);
        System.out.println("Le quotient entier des deux nombres est: "+quotint);
        System.out.println("Le reste de la division euclidienne deux nombres est: "+reste);
    }
    
}
