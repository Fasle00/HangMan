public class fabian {
    public static String usedLetters = "";
    public static boolean validChar(char in){
        if (usedLetters.contains(String.valueOf(in))){
            return false;
        }else {
            usedLetters += in;
            return true;
        }
    }
    public static void showProgress(int fel){
        if (fel == 11){
            System.out.println("       _________   ");
            System.out.println("       |/      ¤   ");
            System.out.println("       |      /|\\ ");
            System.out.println("       |      / \\  ");
            System.out.println("  ____/|\\___       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 10){
            System.out.println("       _________   ");
            System.out.println("       |/      ¤   ");
            System.out.println("       |      /|\\ ");
            System.out.println("       |      /    ");
            System.out.println("  ____/|\\___       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 9){
            System.out.println("       _________   ");
            System.out.println("       |/      ¤   ");
            System.out.println("       |      /|\\ ");
            System.out.println("       |           ");
            System.out.println("  ____/|\\___       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 8){
            System.out.println("       _________   ");
            System.out.println("       |/      ¤   ");
            System.out.println("       |      /|   ");
            System.out.println("       |           ");
            System.out.println("  ____/|\\___      ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 7){
            System.out.println("       _________   ");
            System.out.println("       |/      ¤   ");
            System.out.println("       |       |   ");
            System.out.println("       |           ");
            System.out.println("  ____/|\\___       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 6){
            System.out.println("       _________   ");
            System.out.println("       |/      ¤   ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("  ____/|\\___       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 5){
            System.out.println("       _________   ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("  ____/|\\___       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 4){
            System.out.println("       _________   ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("  ____/|____       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 3){
            System.out.println("       _________   ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("  _____|____       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 2){
            System.out.println("                   ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("       |           ");
            System.out.println("  _____|____       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else if (fel == 1){
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("  __________       ");
            System.out.println(" /          \\     ");
            System.out.println("/            \\    ");
        }else {
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("                   ");
            System.out.println("~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static void replaceLetter(char letter){
        char[] hidden = Main.hiddenWord.toCharArray();
        for (int i = 0; i < Main.word.length();i++){
            if (Main.word.charAt(i)==letter){
                hidden[i] = letter;
            }
        }
        Main.hiddenWord = hidden.toString();
    }


}
/*


linus:
void showHiddenWord(){
sout(Main.hiddenWord);
}

fabian:
void showProgress()
boolean validChar()
String replaceLetter(String hidden, char letter)

void main-main(String[] args){
ord = något();
for(int i = 0; i < ord.length(); i++){
hiddenword = hiddenword + "_";
}
    |
  __|_
 /    \
/      \
guessed letters: a b c
____
guess a letter: (guess)
 */