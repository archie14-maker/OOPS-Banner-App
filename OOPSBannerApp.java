public class OOPSBannerApp {

    
    public static void printCharacter(String[] pattern) {
        for (String line : pattern) {
            System.out.println(line);
        }
        System.out.println();
    }
    public static void renderWord() {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };

        String[] S = {
                " *****",
                "*     ",
                " *****",
                "      *",
                " *****"
        };

        printCharacter(O);
        printCharacter(O);
        printCharacter(P);
        printCharacter(S);
    }

    public static void main(String[] args) {
        renderWord();   // calling static function
    }
}
