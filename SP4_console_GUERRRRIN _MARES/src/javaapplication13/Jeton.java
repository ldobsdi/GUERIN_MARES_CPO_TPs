/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import java.util.Random;

/**
 *
 * @author egnma
 */
public class Jeton {
    //Attributs
    Random generateurAleat = new Random(); 
    String Couleur ; //Couleur affecté au joueur
    int unoudeux;
    
    //Méthodes :
    public String lireCouleur(int parametre){ //Initialisation de la couleur du jeton aléatoirement
        
        
        if(parametre==1){
            Couleur = "Jaunes";
            }
        else {
            Couleur = "Rouges";
        }
        System.out.println("Vous avez les jetons " + Couleur);
        return Couleur;
        
        
    }
}
