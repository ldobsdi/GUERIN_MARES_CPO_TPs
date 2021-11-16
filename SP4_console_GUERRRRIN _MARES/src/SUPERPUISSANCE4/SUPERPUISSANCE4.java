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
        Partie jeu = new Partie();
        jeu.ListeJoueurs[0] = Joueur1;
        jeu.ListeJoueurs[1] = Joueur2;
    
                
        
        //Lancement de la partie
    }
        
        
       