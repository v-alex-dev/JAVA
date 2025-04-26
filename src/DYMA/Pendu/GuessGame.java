package DYMA.Pendu;

import java.util.ArrayList;
import java.util.List;

public class GuessGame {

    private final List<Character> secretWord = new ArrayList<>();

    private int lifePoint;

    private final List<Character> guessWord = new ArrayList<>();

    public GuessGame(String wordToGuess, int lifePoint) {
        for (char c : wordToGuess.toCharArray()){
            this.secretWord.add(c);
        }
        this.lifePoint = lifePoint;

        for (int index = 0; index < this.secretWord.size(); index++){
            this.guessWord.add('_');
        }
    }

    @Override
    public String toString() {
        return "GuessGame{" +
                "lifePoint=" + lifePoint +
                ", guessWord=" + guessWord +
                '}';
    }
}
