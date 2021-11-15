/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERPUISSANCE4;

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
    public Joueur(String nom){
        Nom = nom;
        nombreDesintegrateurs = 0;
    }
    
    public void affecterCouleur(String Couleur){
        Jeton.Couleur = Couleur;
    }

    public void ajouterjeton(){
        
    }
    
    public void obtenirDesintegrateur(){
        
    }
    
    public void utiliserDesintegrateur(){
}
}

