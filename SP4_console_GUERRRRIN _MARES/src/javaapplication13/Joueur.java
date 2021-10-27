/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author egnma
 */
public class Joueur {
    Scanner saisieUtilisateur = new Scanner(System.in);
    Random generateurAleat = new Random();
        
    // Attributs
    String Nom;
    String Couleur;
    int [] ListeJetons = new int[21];
    int nombreJetonsRestants ; // =lenght.ListeJetons
    int nombreDesintegrateurs ;
    //int parametre;
    
    //Méthodes
    public int Joueur(int parametre){
        System.out.println("Quel est votre prenom/surnom ?");
        String Nom = saisieUtilisateur.next();
        parametre = generateurAleat.nextInt(2);

        System.out.println(parametre + Nom);
        return parametre ;
        
    }
    
    public String affecterCouleur(int k){
        Couleur.Jeton(k);
    }
    
    public void ajouterjeton(){
        
    }
    
    public void obtenirDesintegrateur(){
        
    }
    
    public void utiliserDesintegrateur(){
}
}

