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
    // Attributs :
    Cellule [][] CellulesJeu = new Cellule[6][7];
    
    //Méthodes
    public  Grille() { // Initialisation d'une grille vide
        for (int i = 0; i < 6 ; i++) { // On prend la première ligne puis on initialise 
                                        // chaque colonne : de la première à la 7ème 
            for (int j = 0; j < 7; j++){
        CellulesJeu [i][j] = new Cellule(null, false, false );
        
            }
        }
    }
        
    public boolean ajouterJetonDansColonne(Partie unePartie, Jeton unJeton, int colonne){
        int ligne = 0;  
        
        //On se place sur chaque ligne de bas en haut, sur chacune des lignes on regarde si l'emplacement est disponible, si il l'est, on y place un jeton.
        while (ligne<6){
            
            //Cas ou l'ajout d'un jeton est possible
            if (CellulesJeu[5-ligne][colonne-1].affecterJeton(unJeton)){
                
                //Cas où le jeton est affecté à une case avec  "seulement" un désintégrateur
                if (CellulesJeu[5-ligne][colonne-1].desintegrateur){
                    unePartie.joueurCourant.nombreDesintegrateurs++;
                    System.out.println("le joueur à gagné un désintégrateur.");
                }
                
                //Cas ou l'emplacement contient un trou noir et un désintégrateur.
                if (CellulesJeu[5-ligne][colonne-1].trouNoir && CellulesJeu[5-ligne][colonne-1].desintegrateur ){
                    CellulesJeu[5-ligne][colonne-1].activerTrouNoir();
                    CellulesJeu[5-ligne][colonne-1].recupererDesintegrateur();
                    System.out.println("Le jeton du joueur a été aspiré par le trou noir!"
                            + " Vous remportez donc un désintégrateur !");
                }
                
                //Cas ou l'emplacement contient un seul un trou noir.
                if (CellulesJeu[5-ligne][colonne-1].trouNoir){
                    System.out.println("Le jeton du joueur a été aspiré par un trou noir !");
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
      
    public boolean etreRemplie(){//Cette méthode renvoie vrai si la grille est remplie
        int var = 0;
        for (int i=1; i<6;i++){//Cette série de for regarde si chacune des cases est remplie, si c'est le cas la méthode renvoie true, sinon elle return false
            for (int j=1;j<7;j++){
                if (CellulesJeu[i][j].jetonCourant==null){//On regarde si la cellule à la meme colonne et si la meme ligne est vide
                    var = 1 ;
                    
                }

                }
        }
        if(var== 1){
            return false ;
            
        }
        else{
             return true;
    }
    }
    //Cette méthode réinitialise la grille

    public void viderGrille(){ //Cette méthode vide la grille de son contenu
        for (int i=1; i<6;i++){
            for (int j=1;j<7;j++){
                   CellulesJeu[i][j].jetonCourant=null;
            }
    }
    }
    public void afficherGrilleSurConsole(){//affichage de la grille sur la console
        String Text="";
        for (int i = 0; i<6; i++){
            for (int j = 0; j<7; j++){//série de for qui parcours l'ensemble des cases de la grille
                
                //Cas ou il y'a un trou noir & un désintégrateur ou seulement un trou noir dans la case
                if ((CellulesJeu[i][j].trouNoir && CellulesJeu[i][j].desintegrateur)
                     ||(CellulesJeu[i][j].trouNoir)){
                    Text+="[O]";
                }
                
                //Cas ou il y'a seulement un désintégrateur dans la case
                else if (CellulesJeu[i][j].desintegrateur){
                    Text+="[\u001B[36m"+"D"+"\u001B[0m]";
                }
                
                ////Cas ou la case est vide
                else if (CellulesJeu[i][j].jetonCourant==null){
                    Text+="[ ]";
                }
                
                //cas ou la case contient un jeton
                else{
                    Text+="["+CellulesJeu[i][j].lireCouleurDuJeton()+"]";
                }
                
                //Ajout des numéros de ligne
                if (j == 6){
                    Text+= " " + (i+1);
                }
            }
            Text+="\n";
        }
        //Ajout des numéros de colonne
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(Text);
    }
    public boolean celluleOccupee(int i, int j){ //Cette méthode check si la cellule est occupée, renvoie true si c'est le cas
        if (CellulesJeu[i][j]!=null){
            return true;
    }
        else {
            return false; //sinon elle renvoie false
    }

    }
    public String lireCouleurDuJeton(int coor1, int coor2){ //renvoie la couleur du jeton de la cellule
        if (CellulesJeu[coor1-1][coor2-1] != null){
            return CellulesJeu[coor1-1][coor2-1].jetonCourant.lireCouleur();
        }
        else{
            return "case innocupée";
        }
    }
    public boolean etreGagnantePourJoueur(Joueur unJoueur){//cette méthode renvoie vrai si un des deux joueur est gagnant.
        //On définit un compteur qu'on incrémenteras pour chaque jeton 
        
        int compteur = 0;
        
        //série de for qui parcours les cases de la grille
        for (int i = 0; i<6; i++){ //i = les lignes
            for (int j = 0; j<6;j++){ //j = les colonnes
                
                //Dans ce cas-ci on compare deux cases l'une à  coté de l'autre horizontalement
                //On vérifie si les deux cases comparées contiennent un jeton
                if (CellulesJeu[i][j].jetonCourant!=null && CellulesJeu[i][j+1].jetonCourant!=null){
                   System.out.println("ok"); 

                    if (CellulesJeu[i][j].jetonCourant.CouleuR == unJoueur.Couleur && CellulesJeu[i][j+1].jetonCourant.CouleuR == unJoueur.Couleur){//on vérifie si les cases contiennent un jeton de la même couleur, on rajoute 1 aux compteur si c'est le cas
                        System.out.println("ok2"); 
                        compteur += 1;
                        System.out.println(compteur); 
                        if (compteur == 3){
                            return true;
                        }
                    }
                    else{
                        compteur = 0;
                    }
                }

                else{compteur = 0;}
                //System.out.println(compteur); 
            }
            
            compteur = 0;
        }
        
 
        
        //Réinitialisation du compteur
        compteur = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 5; i++)
                                //Dans ce cas-ci on compare deux cases l'une à  coté de l'autre verticalement.
                //On vérifie si les deux cases comparées contiennent un jeton
                if (CellulesJeu[i][j].jetonCourant!=null && CellulesJeu[i+1][j].jetonCourant!=null){
                   

                    if (CellulesJeu[i][j].jetonCourant.CouleuR == unJoueur.Couleur
                        &&CellulesJeu[i+1][j].jetonCourant.CouleuR == unJoueur.Couleur){
                        compteur += 1;
                        if (compteur == 3){
                            return true;
                        }
                    }
                    else{
                        compteur = 0;
                    }
                }
            compteur = 0;
            }
        
        //On vas maintenant vérifier le cas ou les cases sont l'une a coté de l'autre diagonalement.
        
        /*On défini un point de départ à partir duquel on dÃ©scend en diagonale en 
        faisant varrier i et j. Ce point de départ ne peut se situer que sur la ligne du haut et la colonne la plus à gauche.
        En déplacant ce point le long de la colonne de gauche, puis le long de la ligne du haut, on peut couvrir toute les cases*/
        int iDepart = 0;   
        int jDepart = 0;
        int i = 0;
        int j = 0;
        compteur = 0;
        //On parcourt dans un premier temps la colonne de gauche. Il n'est pas nécessaire d'aller au dela de la 3ème ligne car après cette ligne on ne peux pas caser 4 jeton sur la diagonale déscendante
        
        while (iDepart<3){
            
            //Cette première condition permet de s'arrèter quand on atteint le bord du plateau
            while ((i+iDepart)<5 && (j+jDepart)<6){
                
                //on vérifie que les deux cases comparées contiennent bien un jeton pour éviter tout problèmes par la suite
                if (CellulesJeu[iDepart+i][jDepart+j].jetonCourant!=null && CellulesJeu[iDepart+i+1][jDepart+j+1].jetonCourant!=null){
                    
                    //on compare un jeton à celui qui suit dans la diagonale
                    if (CellulesJeu[iDepart + i][jDepart + j].jetonCourant.CouleuR.equals(unJoueur.Couleur)
                            && CellulesJeu[iDepart + i + 1][jDepart + j + 1].jetonCourant.CouleuR.equals(unJoueur.Couleur)) {
                        compteur += 1; // si les deux jetons sont identiques, on implémente
                        System.out.println(compteur);
                        if (compteur == 3) { //Si le compteur atteint 3, la condition de victoire est remplie
                            return true;
                        } 
                    }else {
                        compteur = 0;
                        }
                }
                i++; 
                j++;
            }
            i=0;
            j=0;
            compteur = 0;
            iDepart++;
        }
        
       //On parcourt maintenant la ligne du haut
        //A partir de la cellule d'indice [0][3], il n'est plus possible d'alligner 4 jetons en diagonale. vérifier après cette cellule n'est donc pas nécessaire
        iDepart = 0;
        jDepart = 0;
        i=0;
        j=0;
        compteur = 0;
        while (jDepart < 4) {

            //la boucle s'arrète quand on atteint le bord du tableau
            while ((i + iDepart) < 5 && (j + jDepart) < 6) {

                ///Cette condition compare un jeton Ã  son suivant dans la diagonale
                if (CellulesJeu[iDepart + i][jDepart + j].jetonCourant != null && CellulesJeu[iDepart + i + 1][jDepart + j + 1].jetonCourant != null) {

                    //Cette condition compare un jeton à son suivant dans la diagonale
                    if (CellulesJeu[iDepart + i][jDepart + j].jetonCourant.CouleuR ==unJoueur.Couleur
                            && CellulesJeu[iDepart + i + 1][jDepart + j + 1].jetonCourant.CouleuR == unJoueur.Couleur) {
                        compteur += 1; 
                        if (compteur == 3) { //le compteur atteint 3, il y'a une victoire
                            return true;
                        }
                    } else {
                        compteur = 0;
                    }
                }
                i++; 
                j++;
            }
            i = 0;
            j = 0;
            compteur = 0;
            jDepart++;
        }
        
        
        
        //On fait la meme chose pour les diagonales ascendantes
        iDepart = 5;
        jDepart = 0;
        i=0;
        j=0;
        compteur = 0;
        
        
        
        while (iDepart>2){
            
           
            while ((i+iDepart)>0 && (j+jDepart)<6){
                
               
                if (CellulesJeu[iDepart+i][jDepart+j].jetonCourant!=null && CellulesJeu[iDepart+i-1][jDepart+j+1].jetonCourant!=null){
                    
                    
                    if (CellulesJeu[iDepart + i][jDepart + j].jetonCourant.CouleuR == unJoueur.Couleur
                            && CellulesJeu[iDepart + i - 1][jDepart + j + 1].jetonCourant.CouleuR == unJoueur.Couleur) {
                        compteur += 1; 
                        if (compteur == 3) { 
                            return true;
                        } 
                    }else {
                        compteur = 0;
                        }
                }
                i--; 
                j++;
                
            }
            iDepart--;
            compteur = 0;
            i=0;
            j=0;
            
        }
        
        
        iDepart = 5;
        jDepart = 0;
        i=0;
        j=0;
        compteur = 0;
        while (jDepart < 3) {

            
            while ((i + iDepart) > 0 && (j + jDepart) < 6) {

                
                if (CellulesJeu[iDepart + i][jDepart + j].jetonCourant != null && CellulesJeu[iDepart + i - 1][jDepart + j + 1].jetonCourant != null) {

                   
                    if (CellulesJeu[iDepart + i][jDepart + j].jetonCourant.CouleuR == unJoueur.Couleur
                            && CellulesJeu[iDepart + i - 1][jDepart + j + 1].jetonCourant.CouleuR == unJoueur.Couleur) {
                        compteur += 1; 
                        if (compteur == 3) { 
                            return true;
                        }
                    } else {
                        compteur = 0;
                    }
                }
                i--; 
                j++;
            }
            jDepart++;
            compteur = 0;
            i=0;
            j=0;
        }    
        return false;
    }
    
    public void tasserGrille(int coor1, int coor2){
        Jeton JetonTemp; //variable temporaire pour stocker un jeton
        if (CellulesJeu[coor1][coor2].jetonCourant == null){
            for (int i = coor1-1; i>=0; i--){
                JetonTemp = CellulesJeu[i][coor2].recupererJeton();//Récupération du jeton dans la case n+1 (-1 ici car i va de haut en bas)
                CellulesJeu[i][coor2].jetonCourant = null;//Suppression du jeton dans la case n+1
                CellulesJeu[i+1][coor2].affecterJeton(JetonTemp);//Affectation du jeton dans la case n
            }
        }
    }
    public Jeton recupererJeton(int coor1,int coor2){//Cette méthode enlève le	jeton de la cellule visée et renvoie une référence vers	ce jeton.
   
        Jeton JetonArenvoyer;
        JetonArenvoyer = CellulesJeu[coor1][coor2].jetonCourant;
        CellulesJeu[coor1][coor2].jetonCourant = null;
        
        
        //Variables permettant de récupérer les coordonnées du jeton visé


        return JetonArenvoyer;   
        
    }
    public boolean colonneRemplie(int colonne){
        return CellulesJeu[0][colonne - 1].jetonCourant != null;
    }
    
}


    



