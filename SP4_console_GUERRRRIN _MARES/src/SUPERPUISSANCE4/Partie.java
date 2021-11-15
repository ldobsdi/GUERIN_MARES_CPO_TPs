/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERPUISSANCE4;

import java.util.Random;// nombre aléatoire
import java.util.Scanner;// input
/**
 *
 * @author egnma
 */
public class Partie {
    //Attributs :
    Joueur [] ListeJoueurs = new Joueur[2] ; 
    Joueur joueurCourant ;
    Grille grilleJeu ;
   
    
    //Methodes ;
    
    public void AttribuerCouleursAuxJoueurs(Joueur J1, Joueur J2){
        String Couleur1 = "bleu"; 
        String Couleur2 = "Rouge";
        Random r = new Random(); // Permet un choix aléatoire des couleurs
        int attribution = r.nextInt(2);
        if (attribution == 0){
            J1.affecterCouleur(Couleur1);
            J2.affecterCouleur(Couleur2);
        }
        else{
            J1.affecterCouleur(Couleur2);
            J2.affecterCouleur(Couleur1);
                   
        }
    }
    
    public void initialiserPartie(){
    }
    
    public void debuterPartie() {
        
    }
}
