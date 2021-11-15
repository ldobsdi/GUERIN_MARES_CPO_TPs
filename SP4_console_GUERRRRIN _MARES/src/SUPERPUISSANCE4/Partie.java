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
        //Création de la grille de jeu 
        grilleJeu = new Grille();
        
        //placement des trou noirs
        int compteurtn = 0; // tn = trous noirs
        
        int compteurdses = 0;// Ce compteur permet de compter le nombre de désintégrateurs
                         //placés sur des trous noirs
        int compteurDes = 0;// Des = désintégrateurs
        Random rand = new Random();
        int coor1;
        int coor2;
        
       while (compteurtn != 5){
            //Coordonnées aléatoires
            coor1 = rand.nextInt(6); // 6 lignes
            coor2 = rand.nextInt(7); // 7 colonnes
            
            if (grilleJeu.Cellules[coor1][coor2].placerTrouNoir()){
                //Si le placement du trou noir est possible, on rajoute un désintégrateur.
                if (compteurdses < 2){
                grilleJeu.Cellules[coor1][coor2].placerDesintegrateur();
                compteurdses++;//On incrément le compteur trounoir/Désintégrateur dans la boucle
                }
                
                compteurtn+=1;//On incrémente le compteur trou noir dans la boucle
            }
        }
        //Une fois les 5 trou noirs et les 2 désintégrateurs associés placés, il reste à placer les 3 désintégrateurs restants
        
        while (compteurDes < 3){
            coor1 = rand.nextInt(6);
            coor2 = rand.nextInt(7);
            
            //On place les trois désintégrateurs restants sur des cases où il n'y a pas de trou noir et de desintegrateur
            if (!grilleJeu.Cellules[coor1][coor2].presenceTrouNoir() && 
                !grilleJeu.Cellules[coor1][coor2].presenceDesintegrateur()){
                grilleJeu.Cellules[coor1][coor2].placerDesintegrateur();
                compteurDes++;
            }
        }
        
        //attribution des jetons
        for (int i = 0; i<21; i++){
            //rajoute un jeton
            
            ListeJoueurs[0].ajouterJeton(new Jeton(ListeJoueurs[0].Couleur));
            ListeJoueurs[1].ajouterJeton(new Jeton(ListeJoueurs[1].Couleur));
        }
        
        }
    }
    
    public void debuterPartie() {
        
    }

