/**
 * OOPSBannerApp
 * This application displays "OOPS" on the console as a literal string (UC1)
 * and then renders it in a large banner format using ASCII art (UC2).
 * * @author Your Name
 * @version 2.0
 */
public class OOPSBannerApp {

    /**
     * The main method serves as the entry point for the application.
     * * @param args Command line arguments
     */
    public static void main(String[] args) {

        // ==========================================
        // UC1: Print OOPS to Console
        // ==========================================
        System.out.println("--- UC1: Standard Print ---");
        System.out.println("OOPS");

        System.out.println(); // Blank line for spacing

        // ==========================================
        // UC2: Render OOPS as Banner using Print Statements
        // ==========================================
        System.out.println("--- UC2: Banner Print ---");

        // Rendering the OOPS Banner.
        // Each letter is formatted to a 9-character width.
        // String concatenation (+) combines O + O + P + S for each line.

        System.out.println("  ***** " + " " + "  ***** " + " " + "******* " + " " + "  ***** ");
        System.out.println(" * * " + " " + " * * " + " " + "* * " + " " + " * ");
        System.out.println("* *" + " " + "* *" + " " + "* * " + " " + "* ");
        System.out.println("* *" + " " + "* *" + " " + "******* " + " " + " ***** ");
        System.out.println("* *" + " " + "* *" + " " + "* " + " " + "      * ");
        System.out.println(" * * " + " " + " * * " + " " + "* " + " " + "       * ");
        System.out.println("  ***** " + " " + "  ***** " + " " + "* " + " " + "  ***** ");

    }
}