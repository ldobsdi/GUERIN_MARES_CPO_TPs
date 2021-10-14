/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_mares_guerin;

/**
 *
 * @author doria
 */
public class BouteilleBiere {
    String Nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
    //Méthodes 
    public void lireEtiquette() {
    System.out.println("\n Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    public void Décapsuler() {
        if (ouverte==true){
            System.out.println("erreur : biere déjà ouverte");
                    }
        if (ouverte == false) {
            ouverte = true; 
        }
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
            }    
    
    
    //Constructeur
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }

    
}

    
        
    

