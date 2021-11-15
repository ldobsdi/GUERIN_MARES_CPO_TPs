/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERPUISSANCE4;

import SUPERPUISSANCE4.Cellule;

/**
 *
 * @author egnma
 */
public class Grille {

    Cellule [][] CellulesJeu = new Cellule[6][7];
    
    public void Grille() {
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 7; j++){
        CellulesJeu [i][j] = null;
        
            }
        }
    }
        
    public boolean ajouterJetonDansColonne(Partie unePartie, Jeton unJeton, int colonne){
        int ligne = 0;  
        
        //On se place sur chaque ligne de bas en haut, sur chacune des lignes on regarde si l'emplacement est disponible, si il l'est, on y place un jeton.
        while (ligne<6){
            
            //Cas ou l'ajout d'un jeton est possible
            if (CellulesJeu[5-ligne][colonne-1].affecterJeton(unJeton)){
                
                //Cas où le jeton est affecté à une case avec un seul désintégrateur
                if (CellulesJeu[5-ligne][colonne-1].recupererDesintegrateur()){
                    unePartie.joueurCourant.nombreDesintegrateurs++;
                    System.out.println("le joueur à gagné un désintégrateur.");
                }
                
                //Cas ou l'emplacement contient un trou noir et un désintégrateur.
                if (CellulesJeu[5-ligne][colonne-1].trouNoir && CellulesJeu[5-ligne][colonne-1].desintegrateur ){
                    CellulesJeu[5-ligne][colonne-1].activerTrouNoir();
                    CellulesJeu[5-ligne][colonne-1].recupererDesintegrateur();
                    System.out.println("Malheur ! le jeton du joueur a été aspiré !"
                            + " Oh ! Vous remportez un désintégrateur");
                }
                
                //Cas ou l'emplacement contient un seul un trou noir.
                if (CellulesJeu[5-ligne][colonne-1].trouNoir){
                    System.out.println("Malheur ! le jeton du joueur a été aspiré par un trou noir !");
                    CellulesJeu[5-ligne][colonne-1].activerTrouNoir();   
                }
                

                
                return true;
            }
            //Cas ou l'emplacement contient deja un jeton
            else{
                ligne+=1;
            }
        }
        return false;
    }
    }





       
    



