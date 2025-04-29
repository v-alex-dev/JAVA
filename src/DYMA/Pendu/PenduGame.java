package DYMA.Pendu;

import java.util.Random;
import java.util.Scanner;

public class PenduGame {
    public static void start() {
        final var random = new Random();
        final var scanner = new Scanner(System.in);
        final String[] wordArray = ("Taille,Maureen,Alexandre,Miracle,Freya,Anniversaire,Mariage,Dessin,Christelle,Xavier,Sophie,Josette,Maison,Mur,Galaxie,Planete").split(",");
        final var word = wordArray[random.nextInt(wordArray.length)];

        var guessGame = new GuessGame( word, 10);
        Boolean game = true;
        System.out.print("Hello, bienvenue au pendu.");
        do {
            System.out.print("Choisissez une lettre");

            if(GuessGame.isLost()){
                System.out.print("C'est perdu");
            }
            if(guessGame.isWin()){
                System.out.print("C'est gagné !");
            }

        }while (game);
    }
}
