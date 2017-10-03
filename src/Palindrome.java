/*
        L2IN
Nom : Oussoumanou Benoit
Matricule : 16B156FS
 */

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);                                     //création d'un objet scanner qui récupère les entrées du clavier
        System.out.println("Ceci est la classe Palindrome.");
        System.out.println("Veuilliez saisir un mot: ");
        String chaine = sc.nextLine();                                          //On stocke les valeurs saisie par l'utilisateur dans la chaine de caractère "chaine" 
        chaine = chaine.toUpperCase();                                          //On met toute la chaine en majuscule pour éviter les problèmes de casse
        int i=0, j = chaine.length()-1, mil=j/2;                                //Création des variables 1er caractère, dernier caractère et milieu de la chaine saisie
        boolean pal=true;
        do{                                                                     //Boucle qui compare les caractères
            if (chaine.charAt(i)==chaine.charAt(j-i)){
                i++;
            }
            else{
                pal=false;
                break;
            }
        }while(i<=mil);
        if (pal){
           System.out.println("Palindrome");
        }
        else{
           System.out.println("Non");
       }
    }
}