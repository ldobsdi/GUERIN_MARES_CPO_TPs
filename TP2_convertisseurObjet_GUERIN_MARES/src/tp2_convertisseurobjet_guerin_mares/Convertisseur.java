/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_guerin_mares;



/**
 *
 * @author doria
 */

public class Convertisseur {
    
    double tempCelcius;
    double tempKelvin ;
    double conversion ;
    double t;
    double result;
    int nbConversions;
    public Convertisseur () {
       nbConversions = 0;  
    }

    
    
    public double CelciusVersKelvin (double t) { 
      t = t + 273.15;
      System.out.println("température en Kelvin: " + t);
      nbConversions += 1;
      System.out.println("Le nombre de conversions est:" + nbConversions);
      return t;
      
     }
    
    public double KelvinVersCelsius ( double t) { 
     t = t - 273.15;
     System.out.println("température en Celcius: " + t);
     nbConversions += 1;
     System.out.println("Le nombre de conversions est:" + nbConversions);
     return (float) t;
     
    }
    
    public double CelciusVersFarenheit ( double t) { 
     t = t * 1.8000 + 32.00;
     System.out.println("température en Farenheit: " + t);
     nbConversions += 1;
     System.out.println(nbConversions);
     System.out.println("Le nombre de conversions est:" + nbConversions);
     return t;
     
    }
    
    public double KelvinVersFarenheit ( double t) { 
     t = (t * 9.0/5.0)-459.67;
     System.out.println("température en Farenheit: " + t);
     nbConversions += 1;
     System.out.println(nbConversions);
     System.out.println("Le nombre de conversions est:" + nbConversions);
     return (double) t;
    }
    
    public double FarenheitVersCelsius ( double t) { 
     
     t = (t-32)/1.800000;
     System.out.println("température en Celcius: " + t);
     nbConversions += 1;
     System.out.println(nbConversions);
     System.out.println("Le nombre de conversions est:" + nbConversions);
      return 0;
      
    }
    
    public double FarenheitVersKelvin ( double t) { 
     t= (t-32)/1.8 + 273.15;
     System.out.println("température en Kelvin: " + t);
     nbConversions += 1;
     System.out.println("Le nombre de conversions est:" + nbConversions);
     return (float) (t);
    }
    @Override
    public String toString () {
        return ("nb de conversions"+ nbConversions);
     
}

   
}


