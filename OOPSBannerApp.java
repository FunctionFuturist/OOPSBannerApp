/**
 * OOPSBannerApp
 * UC4: OOPS banner using Array and Loop
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all lines in array
        String[] banner = {
                String.join(" ", " OOO ", " OOO ", " PPPP ", " PPPP ", " SSSS "),
                String.join(" ", "O   O", "O   O", "P   P", "P   P", "S     "),
                String.join(" ", "O   O", "O   O", "P   P", "P   P", "S     "),
                String.join(" ", "O   O", "O   O", "PPPP ", "PPPP ", " SSS  "),
                String.join(" ", "O   O", "O   O", "P    ", "P    ", "    S "),
                String.join(" ", "O   O", "O   O", "P    ", "P    ", "    S "),
                String.join(" ", " OOO ", " OOO ", "P    ", "P    ", " SSSS ")
        };

        // Loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}