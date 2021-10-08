/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_mares_guerin;

/**
 *
 * @author doria
 */
public class TP2_Bieres_MARES_GUERIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BouteilleBiere UneBiere = new BouteilleBiere("Cuvéee des trolls ", (float) 7.0, "Dubuisson") ;
       UneBiere.Nom = "Cuvée des trolls";
       UneBiere.degreAlcool = (float)7.0 ;
       UneBiere.brasserie = "Dubuisson";
       UneBiere.ouverte = false ;
       UneBiere.lireEtiquette();
       System.out.println("La bouteille est ouverte ? : "+UneBiere.ouverte);
       //Ouverture de la bière
       System.out.println("Je décapsule la bière");
       UneBiere.Décapsuler();
       System.out.println(UneBiere) ;
       
       BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe") ;
       autreBiere.Nom = "Leffe";
       autreBiere.degreAlcool = (float)6.6 ;
       autreBiere.brasserie = "Abbaye de Leffe";
       autreBiere.lireEtiquette();
       autreBiere.ouverte = true ;
       autreBiere.Décapsuler();
       System.out.println(autreBiere) ;
       
       BouteilleBiere BierePelforth = new BouteilleBiere("Pelforth", (float) 7.6, "Brassée dans le Nord") ;
       BierePelforth.ouverte = true ;
       BierePelforth.lireEtiquette();
       BierePelforth.Décapsuler();
       System.out.println(BierePelforth) ;
       
       BouteilleBiere BierePietra = new BouteilleBiere("Pietra", (float) 6, "Brasserie Pietra") ;
       BierePietra.ouverte = false ;
       BierePietra.lireEtiquette();
       BierePietra.Décapsuler();
       System.out.println(BierePietra) ;
       
       BouteilleBiere BiereBelleGueule = new BouteilleBiere("Belle gueule", (float) 5.2, "Brasseur Ergi") ;
       BiereBelleGueule.ouverte = true ;
       BiereBelleGueule.Décapsuler();
       BiereBelleGueule.lireEtiquette();
       System.out.println(BiereBelleGueule) ;
    }

    }
    
