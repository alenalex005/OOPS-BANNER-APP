/**
 * OOPSBannerApp
 * This application displays "OOPS" on the console, demonstrating
 * the progression of code structure, memory efficiency, and modularity.
 *
 * UC1: Prints standard string literal.
 * UC2: Renders in a banner format using string concatenation (+).
 * UC3: Renders in a banner format using String.join() to reduce memory footprint.
 * UC4: Renders banner using a String Array (verbose assignment) and an enhanced for-loop.
 * UC5: Renders banner using Inline Array Initialization for concise code.
 *
 * @author Your Name
 * @version 5.0
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
        // Drawback: Using '+' creates multiple intermediate String objects in memory.
        System.out.println("--- UC2: Banner Print (Using + Operator) ---");
        System.out.println("  ***** " + " " + "  ***** " + " " + "******* " + " " + "  ***** ");
        System.out.println("  * * "   + " " + "  * * "   + " " + "* * "     + " " + "  * * ");
        System.out.println("  * * "   + " " + "  * * "   + " " + "* * "     + " " + "  * ");
        System.out.println("  * * "   + " " + "  * * "   + " " + "******* " + " " + "  ***** ");
        System.out.println("  * * "   + " " + "  * * "   + " " + "* "       + " " + "      * ");
        System.out.println("  * * "   + " " + "  * * "   + " " + "* "       + " " + "  * * ");
        System.out.println("  ***** " + " " + "  ***** " + " " + "* "       + " " + "  ***** \n");

        // ==========================================
        // UC3: Render OOPS as Banner using String.join()
        // ==========================================
        // Benefit: String.join minimizes intermediate object creation, improving performance.
        System.out.println("--- UC3: Banner Print (Using String.join) ---");
        System.out.println(String.join(" ", "  ***** ", "  ***** ", "******* ", "  ***** "));
        System.out.println(String.join(" ", "  * * ",   "  * * ",   "* * ",     "  * * "));
        System.out.println(String.join(" ", "  * * ",   "  * * ",   "* * ",     "  * "));
        System.out.println(String.join(" ", "  * * ",   "  * * ",   /*******/ "******* ", "  ***** "));
        System.out.println(String.join(" ", "  * * ",   "  * * ",   "* ",       "      * "));
        System.out.println(String.join(" ", "  * * ",   "  * * ",   "* ",       "  * * "));
        System.out.println(String.join(" ", "  ***** ", "  ***** ", "* ",       "  ***** \n"));

        // ==========================================
        // UC4: Render OOPS as Banner using String Array and Loop (Verbose)
        // ==========================================
        // Benefit: Centralizes data into an array and loops through it, eliminating repetitive prints.
        System.out.println("--- UC4: Banner Print (Verbose Array Assignment) ---");

        String[] bannerLinesUC4 = new String[7];
        bannerLinesUC4[0] = String.join(" ", "  ***** ", "  ***** ", "******* ", "  ***** ");
        bannerLinesUC4[1] = String.join(" ", "  * * ",   "  * * ",   "* * ",     "  * * ");
        bannerLinesUC4[2] = String.join(" ", "  * * ",   "  * * ",   "* * ",     "  * ");
        bannerLinesUC4[3] = String.join(" ", "  * * ",   "  * * ",   /*******/ "******* ", "  ***** ");
        bannerLinesUC4[4] = String.join(" ", "  * * ",   "  * * ",   "* ",       "      * ");
        bannerLinesUC4[5] = String.join(" ", "  * * ",   "  * * ",   "* ",       "  * * ");
        bannerLinesUC4[6] = String.join(" ", "  ***** ", "  ***** ", "* ",       "  ***** ");

        for (String line : bannerLinesUC4) {
            System.out.println(line);
        }
        System.out.println();

        // ==========================================
        // UC5: Render OOPS as Banner using Inline Array Initialization
        // ==========================================
        // Benefit: Combines declaration, instantiation, and assignment into one highly readable block.
        System.out.println("--- UC5: Banner Print (Inline Array Initialization) ---");

        String[] bannerLinesUC5 = {
                String.join(" ", "  ***** ", "  ***** ", "******* ", "  ***** "),
                String.join(" ", "  * * ",   "  * * ",   "* * ",     "  * * "),
                String.join(" ", "  * * ",   "  * * ",   "* * ",     "  * "),
                String.join(" ", "  * * ",   "  * * ",   /*******/ "******* ", "  ***** "),
                String.join(" ", "  * * ",   "  * * ",   "* ",       "      * "),
                String.join(" ", "  * * ",   "  * * ",   "* ",       "  * * "),
                String.join(" ", "  ***** ", "  ***** ", "* ",       "  ***** ")
        };

        for (String line : bannerLinesUC5) {
            System.out.println(line);
        }
    }
}