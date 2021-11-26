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
    Jeton [] ListeJetons = new Jeton[21];
    int nombreJetonsRestants ; // =lenght.ListeJetons
    int nombreDesintegrateurs ;
    //int parametre;
    
    //Méthodes
    public Joueur(String nom){
        Nom = nom;
        nombreDesintegrateurs = 0;
    }
    
    public void affecterCouleur(String Couleur){
        this.Couleur = Couleur;
        //On utilise this car le nom de la variable globale (Couleur)
        // est le même que celui de la variable en argument de la méthode
    }

    public void ajouterjeton(Jeton jetoon){
        for (int i = 0; i < 21 ; i++){
           if (this.ListeJetons[i] == null){
               this.ListeJetons[i] = jetoon;
        
   }
    }
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs += 1; //INCREMENTATION
    }
    
    public boolean utiliserDesintegrateur(){
         if (nombreDesintegrateurs == 0){// le nombre de desintegrateur est égale à 0
            return false;
        }
        else{
            nombreDesintegrateurs = nombreDesintegrateurs - 1;//enlève un desintegrateur
            return true;
        }
}
}

