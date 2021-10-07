/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author doria
 */
public class GuessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int nbutilisateur = 0;
        Scanner scanneurClav;
        scanneurClav = new Scanner(System.in);
        
        System.out.println("Entrez un mode de difficulté:");
        System.out.println("Pour facile tapez 1");
        System.out.println("Pour normal tapez 2");
        System.out.println("Pour difficile tapez 3");
        int modediff = scanneurClav.nextInt();
        if ( modediff > 3 ) {
            System.out.println("Tapez un nombre entre 1 et 3");
            int modediff = scanneurClav.nextInt();
        }
        
        
        
        
        for (int i=1; i<6; i++) {
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
        }
    
        int nbaleat = generateurAleat.nextInt(100);
        int j = 0;
    
        while ( nbaleat != nbutilisateur ){
            System.out.println("Entrez un nombre entre 0 et 100");
            nbutilisateur = scanneurClav.nextInt();
        
            if ( nbutilisateur<nbaleat ) {
                System.out.println("Trop petit");
                j +=1;
    }
    
            if ( nbutilisateur>nbaleat ) {
                System.out.println("Trop grand");
                j+=1;
    }
     
        if ( nbutilisateur==nbaleat ) {
            j+=1;
            System.out.println("Gagné !"+ "Tu as mis " + j +" tentatives pour gagner.");
           
    }
    }