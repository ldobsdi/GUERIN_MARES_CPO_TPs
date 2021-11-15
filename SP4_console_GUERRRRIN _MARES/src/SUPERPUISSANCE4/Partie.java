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
    //ListeJoueurs[Joueur1;Joueur2] = New String ; JSP
    String joueurCourant ;
    //grilleJeu = ... JSP
    
    //Methodes ;
    
    public void AttribuerCouleursAuxJoueurs(){
        String Couleur1 = "bleu"; 
        String Couleur2 = "Rouge";
        Random r = new Random(); // Permet un choix aléatoire des couleurs
        int attribution = r.nextInt(2);
        if (attribution == 0){
            Joueur1.affecterCouleur(Couleur1);
            Joueur2.affecterCouleur(Couleur2);
        }
        else{
            Joueur1.affecterCouleur(Couleur2);
            Joueur2.affecterCouleur(Couleur1);
                   
        }
    }
    
    public void initialiserPartie(){
        
        //Création ou réinitialisation de la grille de jeu
        
        //Création de la grille de jeu
        if (this.GrilleDeJeu == null){
            GrilleDeJeu = new Grille();
        }
        
        //Réinitialisation de la grille de jeu
        else{
            GrilleDeJeu.viderGrille();
        }
        
        //placement des trou noirs
        int compteurtn = 0; //permet de parcourir la boucle while liée aux trous noirs
        
        int compteurdses = 0;// Ce compteur permet de compter le nombre de désintégrateurs
                         //placés sur des trou noirs
        int compteurDes = 0;//permet de parcourir la boucle while liée aux désintégrateurs
        Random rand = new Random();
        int coor1;
        int coor2;
        while (compteurtn != 5){
            //Coordonnées aléatoires
            coor1 = rand.nextInt(6);
            coor2 = rand.nextInt(7);
            
            if (GrilleDeJeu.Cellules[coor1][coor2].placerTrouNoir()){
                //Si le placement du trou noir est possible, on rajoute un désintégrateur.
                if (compteurdses < 2){
                GrilleDeJeu.Cellules[coor1][coor2].placerDesintegrateur();
                compteurdses++;//On incrément le compteur trounoir/Désintégrateur dans la boucle
                }
                
                compteurtn+=1;//On incrémente le compteur trou noir dans la boucle
            }
        }
        //Une fois les 5 trou noirs et les 2 désintégrateurs associés placés, il reste à placer les 3 désintégrateurs restants
        
        while (compteurDes<3){
            coor1 = rand.nextInt(6);
            coor2 = rand.nextInt(7);
            
            //On place les trois désintégrateurs restants sur des cases où il n'y a pas de trou noir et de desintegrateur
            if (!GrilleDeJeu.Cellules[coor1][coor2].presenceTrouNoir() && 
                !GrilleDeJeu.Cellules[coor1][coor2].presenceDesintegrateur()){
                GrilleDeJeu.Cellules[coor1][coor2].placerDesintegrateur();
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
    
    public void debuterPartie() {
        
    }
}
