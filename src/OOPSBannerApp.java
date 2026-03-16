/**
 * OOPSBannerApp
 * This application displays "OOPS" on the console, demonstrating
 * the progression of code structure and efficiency.
 * * UC1: Prints standard string literal.
 * UC2: Renders in a banner format using string concatenation (+).
 * UC3: Renders in a banner format using String.join() for better memory efficiency.
 * UC4: Renders banner using a String Array and an enhanced for-loop for modularity.
 *
 * @author Your Name
 * @version 4.0
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
        System.out.println("OOPS\n");

        // ==========================================
        // UC2: Render OOPS as Banner using Print Statements (+)
        // ==========================================
        // Drawback: Using '+' creates multiple intermediate String objects in memory,
        // leading to memory overhead and fragmentation.
        System.out.println("--- UC2: Banner Print (Using + Operator) ---");
        System.out.println("  ***** " + " " + "  ***** " + " " + "******* " + " " + "  ***** ");
        System.out.println("  * * " + " " + "  * * " + " " + "* * " + " " + "  * * ");
        System.out.println("  * * " + " " + "  * * " + " " + "* * " + " " + "  * ");
        System.out.println("  * * " + " " + "  * * " + " " + "******* " + " " + "  ***** ");
        System.out.println("  * * " + " " + "  * * " + " " + "* " + " " + "      * ");
        System.out.println("  * * " + " " + "  * * " + " " + "* " + " " + "  * * ");
        System.out.println("  ***** " + " " + "  ***** " + " " + "* " + " " + "  ***** \n");

        // ==========================================
        // UC3: Render OOPS as Banner using String.join()
        // ==========================================
        // Benefit: String.join minimizes intermediate object creation, improving
        // performance and reducing the memory footprint. The " " acts as the delimiter.
        System.out.println("--- UC3: Banner Print (Using String.join) ---");
        System.out.println(String.join(" ", "  ***** ", "  ***** ", "******* ", "  ***** "));
        System.out.println(String.join(" ", "  * * ", "  * * ", "* * ", "  * * "));
        System.out.println(String.join(" ", "  * * ", "  * * ", "* * ", "  * "));
        System.out.println(String.join(" ", "  * * ", "  * * ", "******* ", "  ***** "));
        System.out.println(String.join(" ", "  * * ", "  * * ", "* ", "      * "));
        System.out.println(String.join(" ", "  * * ", "  * * ", "* ", "  * * "));
        System.out.println(String.join(" ", "  ***** ", "  ***** ", "* ", "  ***** \n"));

        // ==========================================
        // UC4: Render OOPS as Banner using String Array and Loop
        // ==========================================
        // Benefit: Centralizes data in an array and eliminates repetitive print
        // statements using an enhanced for-loop, making the code highly maintainable.
        System.out.println("--- UC4: Banner Print (Using Array & Enhanced For-Loop) ---");

        // 1. Create and populate the array holding the banner lines
        String[] bannerLines = {
                String.join(" ", "  ***** ", "  ***** ", "******* ", "  ***** "),
                String.join(" ", "  * * ", "  * * ", "* * ", "  * * "),
                String.join(" ", "  * * ", "  * * ", "* * ", "  * "),
                String.join(" ", "  * * ", "  * * ", "******* ", "  ***** "),
                String.join(" ", "  * * ", "  * * ", "* ", "      * "),
                String.join(" ", "  * * ", "  * * ", "* ", "  * * "),
                String.join(" ", "  ***** ", "  ***** ", "* ", "  ***** ")
        };