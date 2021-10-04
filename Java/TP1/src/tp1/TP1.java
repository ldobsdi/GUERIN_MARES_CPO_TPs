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
        float tempKelvin ;
        float conversion ;
        double t;
        double result;
        Scanner sc;
        sc = new Scanner (System.in);
        
        // Debut du programme
        System.out.println("Boujour, saisissez une valeur !");
        t = sc.nextFloat();
        System.out.println("Choisissez la conversion souhaitée  !");
        conversion = sc.nextFloat() ;
        if (conversion == 1){
            result =  CelciusVersKelvin (t);
            System.out.println("Le résultat est : " + result);
        }
        if (conversion == 2){
            result =  KelvinVersCelsius ( t) ;
            System.out.println("Le résultat est : " + result);
        }
        
    }
    
     public static double CelciusVersKelvin (double t) { 
      t = t + 273.15;
      System.out.println("température en Kelvin: " + t);
      return t;
     }
    
    public static float KelvinVersCelsius ( double t) { 
     t = t - 273.15;
     System.out.println("température en Celcius: " + t);
     return (float) t;
    }
    
    public static float CelciusVersFarenheit ( double t) { 
     t = t * 1.8000 + 32.00;
     System.out.println("température en Farenheit: " + t);
     return t;
    }
    
    public static float KelvinVersFarenheit ( double t) { 
     t = (t × 9/5) - 459,67 ;
     System.out.println("température en Farenheit: " + t);
     return (float) t;
    }
    
    public static float FarenheitVersCelsius ( double t) { 
     
     // à completer
     System.out.println("température en Celcius: " + t);
      return 0;
    }
    
    public static float FarenheitVersKelvin ( double t) { 
     t= (t-32)/1.8 + 273.15;
     System.out.println("température en Kelvin: " + t);
     return (float) (t);
    }
}
