/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array
 * in a single statement using String.join() to construct each banner line.
 * This improves conciseness while maintaining readability and modularity.
 *
 * @author Vithya Krishnan
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration and initialization of banner lines
        String[] lines = {
                String.join(" ",
                        " ******* ",
                        " ******* ",
                        " ******* ",
                        " ******* "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *       "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *       "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " ******* ",
                        " ******* "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join(" ",
                        " ******* ",
                        " ******* ",
                        " *       ",
                        " ******* ")
        };

        // Print banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}