/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERPUISSANCE4;

import java.util.Random;

/**
 *
 * @author egnma
 */
public class Jeton {
    //Attributs
    String Couleur ; //Couleur affecté au joueur
   
    
    //Méthodes :
    public String lireCouleur(){ //Initialisation de la couleur du jeton aléatoirement
        return Couleur;
        
        
    }
    
    public Jeton(String couleur) { //constructeur
    
    Couleur = couleur;
    }
}
