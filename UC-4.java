public class BannerUC4 {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // UC3 Drawback - Individual print statements for each line
        // System.out.println(String.join("", " ***  ", "  ***  ", "  ****  ", "  **** "));
        // System.out.println(String.join("", "*   * ", " *   * ", "  *   * ", "  *    "));
        // ... repeated 7 times — hard to maintain and not reusable
        // -------------------------------------------------------

        // UC4 Approach - Store all lines in a String array
        // Array centralizes the banner data in one place
        // Loop replaces 7 individual print statements with a single reusable block

        // Step 1: Declare a String array with 7 elements (one per banner line)
        String[] bannerLines = new String[7];

        // Step 2: Populate each array index using String.join() from UC3
        bannerLines[0] = String.join("", " ***  ", "  ***  ", "  ****  ", "  **** ");
        bannerLines[1] = String.join("", "*   * ", " *   * ", "  *   * ", "  *    ");
        bannerLines[2] = String.join("", "*   * ", " *   * ", "  *   * ", "  *    ");
        bannerLines[3] = String.join("", "*   * ", " *   * ", "  ****  ", "   *** ");
        bannerLines[4] = String.join("", "*   * ", " *   * ", "  *     ", "      *");
        bannerLines[5] = String.join("", "*   * ", " *   * ", "  *     ", "      *");
        bannerLines[6] = String.join("", " ***  ", "  ***  ", "  *     ", "   **** ");

        // Step 3: Use an enhanced for-loop to iterate and print each line
        // Enhanced for-loop (for-each) - cleaner syntax, no index management needed
        // Syntax: for (dataType variable : arrayName)
        for (String line : bannerLines) {
            System.out.println(line);
        }

    }
