/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_guerin_mares;

import java.util.Scanner;

/**
 *
 * @author doria
 */
public class TP2_convertisseurObjet_GUERIN_MARES {

    private static boolean nbConversions;
    private static float t;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur conversions = new Convertisseur();
        conversions.CelciusVersFarenheit(0);
        conversions.FarenheitVersCelsius(43);
        conversions.KelvinVersFarenheit(7000);
    }
}