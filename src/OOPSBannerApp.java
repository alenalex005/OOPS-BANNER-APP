/**
 * OOPSBannerApp
 * This application displays "OOPS" on the console.
 * UC1: Prints standard string literal.
 * UC2: Renders in a banner format using string concatenation (+).
 * UC3: Renders in a banner format using String.join() for better memory efficiency.
 *
 * @author Your Name
 * @version 3.0
 */
public class OOPSBannerApp {

    /**
     * The main method serves as the entry point for the application.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // ==========================================
        // UC1: Print OOPS to Console
        // ==========================================
        System.out.println("--- UC1: Standard Print ---");
        System.out.println("OOPS");
        System.out.println(); // Blank line for readability

        // ==========================================
        // UC2: Render OOPS as Banner using Print Statements (+)
        // ==========================================
        // Drawback: Using '+' creates multiple intermediate String objects in memory,
        // leading to memory overhead and fragmentation.
        System.out.println("--- UC2: Banner Print (Using + Operator) ---");

        System.out.println("  ***** " + " " + "  ***** " + " " + "******* " + " " + "  ***** ");
        System.out.println(" * * " + " " + " * * " + " " + "* * " + " " + " * * ");
        System.out.println("* *" + " " + "* *" + " " + "* * " + " " + "* ");
        System.out.println("* *" + " " + "* *" + " " + "******* " + " " + " ***** ");
        System.out.println("* *" + " " + "* *" + " " + "* " + " " + "       * ");
        System.out.println(" * * " + " " + " * * " + " " + "* " + " " + " * * ");
        System.out.println("  ***** " + " " + "  ***** " + " " + "* " + " " + "  ***** ");
        System.out.println();

        // ==========================================
        // UC3: Render OOPS as Banner using String.join()
        // ==========================================
        // Benefit: String.join minimizes intermediate object creation, improving
        // performance and reducing the memory footprint. The " " acts as the delimiter.
        System.out.println("--- UC3: Banner Print (Using String.join) ---");

        System.out.println(String.join(" ", "  ***** ", "  ***** ", "******* ", "  ***** "));
        System.out.println(String.join(" ", " * * ", " * * ", "* * ", " * * "));
        System.out.println(String.join(" ", "* *", "* *", "* * ", "* "));
        System.out.println(String.join(" ", "* *", "* *", "******* ", " ***** "));
        System.out.println(String.join(" ", "* *", "* *", "* ", "       * "));
        System.out.println(String.join(" ", " * * ", " * * ", "* ", " * * "));
        System.out.println(String.join(" ", "  ***** ", "  ***** ", "* ", "  ***** "));

    }
}