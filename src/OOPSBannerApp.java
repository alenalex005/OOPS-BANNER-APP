/**
 * OOPSBannerApp
 * This application displays "OOPS" on the console, demonstrating
 * the progression of code structure, memory efficiency, and modularity.
 *
 * UC1: Prints standard string literal.
 * UC2: Renders in a banner format using string concatenation (+).
 * UC3: Renders in a banner format using String.join() to reduce memory footprint.
 * UC4: Renders banner using a String Array (verbose assignment) and an enhanced for-loop.
 * UC5: Renders banner using Inline Array Initialization.
 * UC6: Refactors pattern logic into reusable static helper methods.
 *
 * @author Your Name
 * @version 6.0
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
        System.out.println();

        // ==========================================
        // UC6: Render OOPS as Banner using Helper Methods
        // ==========================================
        System.out.println("--- UC6: Banner Print (Refactored with Methods) ---");

        // 1. Fetch the pattern arrays from our static helper methods
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // 2. Assemble the lines using String.join and inline array initialization
        String[] bannerLinesUC6 = {
                String.join(" ", o[0], o[0], p[0], s[0]),
                String.join(" ", o[1], o[1], p[1], s[1]),
                String.join(" ", o[2], o[2], p[2], s[2]),
                String.join(" ", o[3], o[3], p[3], s[3]),
                String.join(" ", o[4], o[4], p[4], s[4]),
                String.join(" ", o[5], o[5], p[5], s[5]),
                String.join(" ", o[6], o[6], p[6], s[6])
        };

        // 3. Loop-Based Rendering
        for (String line : bannerLinesUC6) {
            System.out.println(line);
        }
    }

    // ==========================================
    // HELPER METHODS FOR UC6
    // ==========================================

    /**
     * Returns the 7-line ASCII pattern for the letter 'O'.
     * @return String array representing the letter O.
     */
    public static String[] getOPattern() {
        return new String[] {
                "  ***** ",
                "  * * ",
                "  * * ",
                "  * * ",
                "  * * ",
                "  * * ",
                "  ***** "
        };
    }

    /**
     * Returns the 7-line ASCII pattern for the letter 'P'.
     * @return String array representing the letter P.
     */
    public static String[] getPPattern() {
        return new String[] {
                "******* ",
                "* * ",
                "* * ",
                "******* ",
                "* ",
                "* ",
                "* "
        };
    }

    /**
     * Returns the 7-line ASCII pattern for the letter 'S'.
     * @return String array representing the letter S.
     */
    public static String[] getSPattern() {
        return new String[] {
                "  ***** ",
                "  * ",
                "  * ",
                "  ***** ",
                "      * ",
                "      * ",
                "  ***** "
        };
    }
}