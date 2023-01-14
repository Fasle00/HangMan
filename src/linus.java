public class linus {
    public static void showHiddenWord(String w) {
        System.out.println(w);
    }

    public static void underScores() {
        for (int i = 0; i < Main.word.length(); i++){
            Main.hiddenWord += "_";
        }
    }
}
