/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_eugene_dorian;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author egnma
 */
public class Stats_EUGENE_DORIAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc;
        sc = new Scanner (System.in);
        float [] tabEntiers = new float[6];
        int m;
        int n;
        int var;
        System.out.println("Boujour, saisissez un nombre entier ! \nm=");
        m = sc.nextInt();
        for (int i=0; i < m ; i++) {
             n = generateurAleat.nextInt(5); 
             for (int j=0; j < 5 ; j++) {
                 if (n == j){
                     tabEntiers[j] += 1 ;
                }
             }
        }
        for (int i=0; i < 5 ; i++) {
            tabEntiers[i] = (tabEntiers[i]*100)/m;
            System.out.println("Pourcentage de " + i +" sur " + m +" coup est " + tabEntiers[i]);    
        }     
    }
    }    

