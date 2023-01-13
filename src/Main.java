import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static String word;
    public static String hiddenWord;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner txt = new Scanner(new File("words.txt"));
        String input;

        int choseWord = (int) ((Math.random()*34)+1);
        for (int i = 0; i < choseWord; i++){
            word = txt.next();
        }
        System.out.println(word);

        int chanses = 0;
        while (chanses < 12){
            // linus.showHiddenWord();
            System.out.print("Guess a letter: ");
            input = scanner.next();
            if (fabian.validChar(input.charAt(0))){
                if (word.contains(input.charAt(0) + "")){
                    fabian.replaceLetter(input.charAt(0));
                }else{
                    chanses++;
                }
            }else {
                System.out.println("try another letter");
            }
            fabian.showProgress(chanses);
            System.out.println("Guessed letters: " + fabian.usedLetters);
        }

    }
}