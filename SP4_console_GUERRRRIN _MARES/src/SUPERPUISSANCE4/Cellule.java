/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERPUISSANCE4;

/**
 *
 * @author egnma
 */
public class Cellule {
    //Attributs :
    // jetonCourant = reference cellule
    boolean trouNoir ;
    boolean desintegrateur ;
    Jeton jetonCourant;
    
    //Methodes
    public Cellule(Jeton JETONCOURANT, boolean Trounoir, boolean Desintegrateur) { //constructeur
        jetonCourant = JETONCOURANT;
        trouNoir = Trounoir;
        desintegrateur = Desintegrateur;
    }    
    Boolean affecterJeton(Jeton jetonAAffecter){ //Affecte un jeton si il n'y en a pas deja un
        
        if(jetonCourant == jetonAAffecter){
            return false; //jeton déja présent sur la case
        }
        else {
            jetonCourant = jetonAAffecter;
            return true;
        }
    
    }
    
    public Jeton recupererJeton(){ //Redonne le jeton
        return jetonCourant;// A COMPLETER
    }
    
    public String lirecouleurdujeton(){
        return jetonCourant.Couleur ; //retourne la couleur du jeton
}
    
    public boolean placerTrouNoir(){ //place le trou noir
        if (trouNoir == false){
            trouNoir = true;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean presenceTrouNoir(){ //Permet de donner la présnece d'un trou noir.
        return trouNoir;
        
    }
    public boolean activerTrouNoir(){//Permet d'activer le trou noire
        if (trouNoir == true){
            trouNoir = false;
            jetonCourant = null;
            return true;
        }
        else{
            return false;
        }
    
    }
    public boolean placerDesintegrateur(){ //place le désintegrateur
        if (desintegrateur == false){
            desintegrateur = true;
            return true;
        }
        else{
        return false;   
        }
    }
    
    public boolean presenceDesintegrateur(){ //Permet de déterminer si il y a un desintegrateur
        return desintegrateur;
        
    }
    
    public boolean recupererDesintegrateur(){ // permet de récupérer le désintegrateur
        if (desintegrateur = true){
            desintegrateur = false;
            return true;
        }
        else{
            return false;
        }
    }
}
