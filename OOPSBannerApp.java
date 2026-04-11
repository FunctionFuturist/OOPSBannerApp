/**
 * OOPSBannerApp
 * UC3: Print OOPS banner using String.join()
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join(" ",
                " OOO ", " OOO ", " PPPP ", " PPPP ", " SSSS ");

        String line2 = String.join(" ",
                "O   O", "O   O", "P   P", "P   P", "S     ");

        String line3 = String.join(" ",
                "O   O", "O   O", "P   P", "P   P", "S     ");

        String line4 = String.join(" ",
                "O   O", "O   O", "PPPP ", "PPPP ", " SSS  ");

        String line5 = String.join(" ",
                "O   O", "O   O", "P    ", "P    ", "    S ");

        String line6 = String.join(" ",
                "O   O", "O   O", "P    ", "P    ", "    S ");

        String line7 = String.join(" ",
                " OOO ", " OOO ", "P    ", "P    ", " SSSS ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}