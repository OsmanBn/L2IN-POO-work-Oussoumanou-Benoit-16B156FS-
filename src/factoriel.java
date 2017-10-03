/*
        L2IN
Nom : Oussoumanou Benoit
Matricule : 16B156FS
 */

import java.util.Scanner;
public class factoriel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                //création d'un objet scanner qui récupère les entrées du clavier
        System.out.println("Ceci est la classe Factoriel.");
        System.out.println("Entrez un nombre entier naturel dont cherche le factoriel: ");
        int nb = sc.nextInt();                              //On stocke les valeurs saisies par l'utilisateur dans la variable de type entier "nb"
        double x = 1;
        for (int i=nb;i>0;i--) x*=i;                        //On multiplie nb par la valeur qui la précède tant que ce n'est pas zéro 
        System.out.println("Factoriel "+nb+" ("+nb+"!) egale "+x);
    }
}