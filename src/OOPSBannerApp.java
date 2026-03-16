/**
 * OOPSBannerApp
 * This application displays "OOPS" on the console, demonstrating
 * the progression of code structure, memory efficiency, and OOP modularity.
 *
 * UC1: Prints standard string literal.
 * UC2: Renders in a banner format using string concatenation (+).
 * UC3: Renders in a banner format using String.join() to reduce memory footprint.
 * UC4: Renders banner using a String Array and an enhanced for-loop.
 * UC5: Renders banner using Inline Array Initialization.
 * UC6: Refactors pattern logic into reusable static helper methods.
 * UC7: Encapsulates pattern data using a static inner class and uses StringBuilder.
 *
 * @author Your Name
 * @version 7.0
 */
public class OOPSBannerApp {

    // ==========================================
    // INNER CLASS FOR UC7 (Encapsulation & Modularity)
    // ==========================================

    /**
     * CharacterPatternMap
     * A static inner class that encapsulates a character and its 7-line banner pattern.
     * This demonstrates Encapsulation, Immutability, and Single Responsibility.
     */
    public static class CharacterPatternMap {
        // Instance variables
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize the character and its corresponding pattern.
         *
         * @param character The character being represented (e.g., 'O')
         * @param pattern   The 7-line String array containing the ASCII art
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Gets the character.
         *
         * @return The character literal
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Gets the pattern array.
         *
         * @return The 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

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
        for (String line : bannerLinesUC4) System.out.println(line);
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
        for (String line : bannerLinesUC5) System.out.println(line);
        System.out.println();

        // ==========================================
        // UC6: Render OOPS as Banner using Helper Methods
        // ==========================================
        System.out.println("--- UC6: Banner Print (Refactored with Methods) ---");
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();
        String[] bannerLinesUC6 = {
                String.join(" ", o[0], o[0], p[0], s[0]),
                String.join(" ", o[1], o[1], p[1], s[1]),
                String.join(" ", o[2], o[2], p[2], s[2]),
                String.join(" ", o[3], o[3], p[3], s[3]),
                String.join(" ", o[4], o[4], p[4], s[4]),
                String.join(" ", o[5], o[5], p[5], s[5]),
                String.join(" ", o[6], o[6], p[6], s[6])
        };
        for (String line : bannerLinesUC6) System.out.println(line);
        System.out.println();

        // ==========================================
        // UC7: Render OOPS as Banner using a Class (Encapsulation)
        // ==========================================
        System.out.println("--- UC7: Banner Print (Using Class & StringBuilder) ---");

        // 1. Instantiate the encapsulated objects
        CharacterPatternMap mapO = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap mapP = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap mapS = new CharacterPatternMap('S', getSPattern());

        // 2. Create an array of objects to represent the word "OOPS"
        CharacterPatternMap[] wordSequence = { mapO, mapO, mapP, mapS };

        // 3. Construct the banner using StringBuilder line by line (7 lines total)
        for (int lineIndex = 0; lineIndex < 7; lineIndex++) {
            StringBuilder sb = new StringBuilder();

            // Loop through each letter in our word sequence
            for (int letterIndex = 0; letterIndex < wordSequence.length; letterIndex++) {
                // Append the current line of the current letter
                sb.append(wordSequence[letterIndex].getPattern()[lineIndex]);

                // Append a space between letters (mimicking String.join delimiter)
                if (letterIndex < wordSequence.length - 1) {
                    sb.append(" ");
                }
            }
            // Print the fully constructed line
            System.out.println(sb.toString());
        }
    }

    // ==========================================
    // HELPER METHODS (Static Data Sources)
    // ==========================================

    /**
     * Returns the 7-line ASCII pattern for the letter 'O'.
     * @return String array representing the letter O.
     */
    public static String[] getOPattern() {
        return new String[] {
                "  ***** ", "  * * ", "  * * ", "  * * ", "  * * ", "  * * ", "  ***** "
        };
    }

    /**
     * Returns the 7-line ASCII pattern for the letter 'P'.
     * @return String array representing the letter P.
     */
    public static String[] getPPattern() {
        return new String[] {
                "******* ", "* * ", "* * ", "******* ", "* ", "* ", "* "
        };
    }

    /**
     * Returns the 7-line ASCII pattern for the letter 'S'.
     * @return String array representing the letter S.
     */
    public static String[] getSPattern() {
        return new String[] {
                "  ***** ", "  * ", "  * ", "  ***** ", "      * ", "      * ", "  ***** "
        };
    }
}