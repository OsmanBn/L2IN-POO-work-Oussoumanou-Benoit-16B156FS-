/*
        L2IN
Nom : Oussoumanou Benoit
Matricule : 16B156FS
*/
import java.util.*;
public class Pair{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                                    //création d'un objet scanner qui récupère les entrées du clavier
        System.out.println("Ceci es la classe Pair. ");
        System.out.println("Entrez un entier naturel: ");
        int nb = sc.nextInt();                                                  //On stocke les valeurs saisies par l'utilisateur dans la variable de type entier "nb"
        if (nb%2==0){                                                           //On verifie si le reste de la division par 2 est nul (nombre pair) ou pas (nombre impaire)           
            System.out.println("Le nombre est pair. ");
        }
        else
            System.out.println("Le nombre "+nb+" est impair. ");
        }
}