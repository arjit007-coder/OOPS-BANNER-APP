public class BannerUC3 {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // UC2 Approach (Drawback) - Using + operator
        // Each + creates a new intermediate String object in memory
        // String line1 = " ***  " + "  ***  " + "  ****  " + "  ****";
        // -------------------------------------------------------

        // UC3 Approach - Using String.join()
        // String.join(delimiter, parts...) joins parts with a delimiter
        // Using "" as delimiter keeps the parts together without any separator
        // This avoids creating intermediate String objects, saving memory

        // Line 1
        System.out.println(String.join("", " ***  ", "  ***  ", "  ****  ", "  **** "));

        // Line 2
        System.out.println(String.join("", "*   * ", " *   * ", "  *   * ", "  *    "));

        // Line 3
        System.out.println(String.join("", "*   * ", " *   * ", "  *   * ", "  *    "));

        // Line 4
        System.out.println(String.join("", "*   * ", " *   * ", "  ****  ", "   *** "));

        // Line 5
        System.out.println(String.join("", "*   * ", " *   * ", "  *     ", "      *"));

        // Line 6
        System.out.println(String.join("", "*   * ", " *   * ", "  *     ", "      *"));

        // Line 7
        System.out.println(String.join("", " ***  ", "  ***  ", "  *     ", "   **** "));

    }
}
