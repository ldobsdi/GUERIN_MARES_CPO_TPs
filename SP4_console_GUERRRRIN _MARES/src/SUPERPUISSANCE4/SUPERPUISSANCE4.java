/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SUPERPUISSANCE4;
import java.util.Scanner;

/**
 *
 * @author egnma
 */
public class SUPERPUISSANCE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Création de l'objet scanner pour récupérer le nom des joueurs
        Scanner sc = new Scanner(System.in);
        
        //Premier joueur
        System.out.println("Saisir le nom du premier joueur");
        Joueur Joueur1 = new Joueur(sc.nextLine());
        
        //Deuxième joueur
        System.out.println("saisir le nom du second joueur");
        Joueur Joueur2 = new Joueur(sc.nextLine());
        
        //Création de la partie
        Partie game = new Partie();
        game.ListeJoueurs[0] = Joueur1;
        game.ListeJoueurs[1] = Joueur2;
                
        
        //Lancement de la partie
        
        
        //On crée une boucle afin que les joueurs puisse rejouer
        int Reponse = 1; //Permet au joueur de choisir si il veut rejouer
        while (Reponse == 1){
            
            game.attribuerCouleurAuxJoueurs(Joueur1, Joueur2);//donne les couleurs aux joueurs
            game.initialiserPartie();
            game.debuterPartie();
        
        //Fin de la partie 
       
            if (game.JoueurCourant != null){
                System.out.println("victoire "+game.JoueurCourant.nom.toUpperCase()+" le boss ");
                game.GrilleDeJeu.afficherGrilleSurConsole();
                System.out.println("Souhaitez vous rejouer? vous etes trop forts! (1 : oui | 0 : non)"); //pour rejouer
                Reponse = sc.nextInt();
            }
            else{
                System.out.println("match nul, apprenez à jouer"); //
                game.GrilleDeJeu.afficherGrilleSurConsole();
                System.out.println("Souhaitez vous rejouer ? (1 : oui | 0 : non)");
                Reponse = sc.nextInt();
            }
        }
        System.out.println("Merci d'avoir joué, vous etes trop fort !");
    } 
}
