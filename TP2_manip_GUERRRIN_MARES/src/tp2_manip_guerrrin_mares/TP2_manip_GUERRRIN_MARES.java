/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_guerrrin_mares;

/**
 *
 * @author egnma
 */
public class TP2_manip_GUERRRIN_MARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables :
        int var;
        
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        assiette2.nbCalories +=1 ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        // 3 Tartiflettes ont été créées
        // assiette3 et assiette2 ne referencent pas à la même tartiflette mais à deux avec le même nombre de calories
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        //Question 5:
        var = assiette1.nbCalories ;    
        assiette1.nbCalories = assiette2.nbCalories ;
        assiette2.nbCalories = var;
        
        // Question 6 - Faux et Faux, on ne peut pas melanger deux classes, la réponse est non
        // Question 7 : Crétion de 10 Moussakas
        Moussaka[] tabMoussaka = new Moussaka [10];
        
        
    }   
    
}
