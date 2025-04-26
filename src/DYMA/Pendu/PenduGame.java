package DYMA.Pendu;

import java.util.Random;
import java.util.Scanner;

public class PenduGame {
    public static void start() {
        final var random = new Random();
        final var scanner = new Scanner(System.in);
        final words[] wordArray = DYMA.Pendu.words.values();
        final var word = wordArray[random.nextInt(wordArray.length)];

        var guessGame = new GuessGame( word, 10);
    }
}
