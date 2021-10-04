/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author egnma
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        //Initialisation des variables
        float tempCelcius;
        float tempKalvin ;
        Scanner sc;
        sc = new Scanner (System.in);
        
        // Debut du programme
        System.out.println("Veuillez saisir une valeur de type Float");
        tempCelcius = sc.nextFloat();
        System.out.println("température en Celsius : " + tempCelcius);
        tempKalvin = tempCelsius + 273,15 ;
        System.out.println("température en Kalvin: " + tempKalvin);
    }

    public float CelciusVersKelvin ( float tempCelcius) { 
     tempKalvin = tempCelcius + 273,15 ;
    }
    public float KelvinVersCelsius ( float tempKalvin) { 
     tempCelcius = tempKalvin - 273,15 ;
}
