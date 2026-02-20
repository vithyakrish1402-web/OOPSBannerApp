/**
 * OOPSBannerApp
 *
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * Description:
 * This use case extends UC3 by storing each banner line
 * in a String array and printing them using a for-each loop.
 * This eliminates repetitive print statements and improves
 * modularity, maintainability, and scalability.
 *
 * Pre-condition:
 * Java environment is properly set up.
 *
 * Post-condition:
 * The OOPS banner is displayed on the console.
 *
 * @author Vithya Krishnan
 * @version 4.0
 */
public class OOPSBannerApp {

    /**
     * Main Method – Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Step 1: Create a String array to hold banner lines
        String[] lines = new String[7];

        // Step 2: Populate array using String.join()

        lines[0] = String.join(" ",
                " ******* ",
                " ******* ",
                " ******* ",
                " ******* ");

        lines[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        lines[2] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        lines[3] = String.join(" ",
                " *     * ",
                " *     * ",
                " ******* ",
                " ******* ");

        lines[4] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        lines[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        lines[6] = String.join(" ",
                " ******* ",
                " ******* ",
                " *       ",
                " ******* ");

        // Step 3: Iterate using for-each loop and print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}