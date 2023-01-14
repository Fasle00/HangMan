public class linus {
    public static void showHiddenWord(String w) {
        System.out.println(w);
    }

    public static void underScores() {
        int length = Main.word.length();
        Main.hiddenWord = "_".repeat(length);
    }
}
