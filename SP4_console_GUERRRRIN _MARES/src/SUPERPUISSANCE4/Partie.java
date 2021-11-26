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
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;

    //Methodes ;
    public void AttribuerCouleursAuxJoueurs(Joueur J1, Joueur J2) {
        String Couleur1 = "\u001B[33m" +"O"+"\u001B[0m"; // JAUNE
        String Couleur2 = "\u001B[31m"+"O"+"\u001B[0m"; //ROUGE
        Random r = new Random(); // Permet un choix aléatoire des couleurs
        int couleurhazard = r.nextInt(2); // NB aléatoire entre 1 et 0 !
        if (couleurhazard == 0) {
            J1.affecterCouleur(Couleur1); //choix arbitraire
            J2.affecterCouleur(Couleur2);
        } else {
            J1.affecterCouleur(Couleur2);
            J2.affecterCouleur(Couleur1);

        }
    }

    public void initialiserPartie() {
        //Création de la grille de jeu 
        grilleJeu = new Grille();

        //placement des trous noirs
        int compteurtn = 0; // tn = trous noirs

        int compteurdses = 0;// Ce compteur permet de compter le nombre de désintégrateurs
        //placés sur des trous noirs
        int compteurDes = 0;// Des = désintégrateurs
        Random rand = new Random();
        //Coord de la case de la grille
        int coor1; // ligne
        int coor2; // colonne
        int coor1aleat; // ligne
        int coor2aleat; // colonne

        while (compteurtn != 5) {
            //Coordonnées aléatoires
            coor1 = rand.nextInt(6); // 6 lignes
            coor2 = rand.nextInt(7); // 7 colonnes
            
            if (grilleJeu.CellulesJeu[coor1][coor2].placerTrouNoir()) { // On fait appel à la classe cellule
                //Si le placement du trou noir est possible, on rajoute un désintégrateur.
                if (compteurdses < 2) {
                    grilleJeu.CellulesJeu[coor1][coor2].placerDesintegrateur();
                    compteurdses += 1;//On incrément le compteur trounoir/Désintégrateur dans la boucle
                }

                compteurtn += 1;//On incrémente le compteur trou noir dans la boucle
            }
        }
        //Une fois les 5 trouS noirs et les 2 désintégrateurs associés placés, il reste à placer les 3 désintégrateurs restants

        while (compteurDes < 3) {
            coor1 = rand.nextInt(6);
            coor2 = rand.nextInt(7);

            //On place les trois désintégrateurs restants sur des cases où il n'y a pas de trou noir ni de desintegrateur
            if (!grilleJeu.CellulesJeu[coor1][coor2].presenceTrouNoir()
                    && //Pas de trou noir
                    !grilleJeu.CellulesJeu[coor1][coor2].presenceDesintegrateur()) { //Pas de desintegrateur
                grilleJeu.CellulesJeu[coor1][coor2].placerDesintegrateur(); // On place
                compteurDes += 1; //incrementation du compteur, un de moins à placer
            }
        }

        //attribution des jetons
        for (int i = 0; i < 21; i++) { //Si tous les jetons ne sont pas placés:
            //rajoute un jeton
            ListeJoueurs[0].ListeJetons[i] = new Jeton("rouge"); //On appelle la méthode de ma classe grille
            ListeJoueurs[1].ListeJetons[i] = new Jeton("jaune");
        }

    }


 public void debuterPartie() {
        int colonneSelec;
        Scanner sc = new Scanner(System.in);//Permet de récupérer la ligne jouée  
        //Déterminer le joueur cournant
        Random r = new Random(); // Permet un choix aléatoire des joueur
        int aleat = r.nextInt(2); // NB aléatoire entre 1 et 0 !
        joueurCourant= ListeJoueurs[aleat];
        // Poser les bases du jeu :
        while(grilleJeu.etreRemplie() == false){ //grille pas pleine
            while(grilleJeu.etreGagnantePourJoueur(joueurCourant)== false){ //Pas encore de gagnant
                //Afficher grille :
                grilleJeu.afficherGrilleSurConsole();
                //Coup du joueur courant
                System.out.println("Saisir le numéro de colonne");
                colonneSelec = sc.nextInt();
                //Coup valide
                while(colonneSelec > 7){
                    System.out.println("Erreur, Saisit un autre numéro de colonne (<7) !");//Colonne non valide ! on redemmande
                    colonneSelec = sc.nextInt();
                }
                
                while(grilleJeu.colonneRemplie(colonneSelec) == true){ 
                    System.out.println("Colonne déja pleine, saisir un autre numéro de colonne");//Colonne non valide ! on redemmande
                    colonneSelec = sc.nextInt();
                }
                    //On prend un jeton du joueur courant
                if(joueurCourant.nombreJetonsRestants != 0){ // On vérifie qu'il reste au moins un jeton au joueur courant
                            Jeton j = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants -1]; // On prend un jeton
                            joueurCourant.nombreJetonsRestants -- ; // On enleve un au nombre de jetons du joueur courant
                        
                    // Jouer le coup
                            grilleJeu.ajouterJetonDansColonne(this, j, colonneSelec); // On met le jeton dans la colonne souhaitée
                     
                    }
                        else{
                            System.out.println("Malheureusement, vous n'avez plus de jeton , vous ne pouvez pas jouer");
                
                }
                //Au tour de l'autre joueur
                if (joueurCourant == ListeJoueurs[1]){
                    joueurCourant = ListeJoueurs[0];
                    }
                else {
                    joueurCourant = ListeJoueurs[1];
                }
            System.out.println("Partie terminée");
            break;
}
        
        }
        }
        
        //Choisir la colonne où insérer le jeton
        
        
        // Faire descendre le jeton
        
        //Vérifier s'il y a un trou noir
        
        // Vérifier s'il y a un désintégrateur
        
        //Vérifier si 4 jetons de la même couleur sont alignés
        
        //on passe au joueur suivant
    }
 

