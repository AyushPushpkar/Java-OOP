package Basic.String;

import static java.lang.System.out;

public class StringEx {
    public static void main(String[] args) {
        // string literal
        String str = " Java Programming";  // Stored in String Pool

        // new keyword
        String heap = new String("String") ; // Stored in Heap

        heap += "Pool"; // Creates a new string object
        out.println(heap);

        // String length
        System.out.println("Length: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Check if contains a substring
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // Replace a word
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // Get substring
        System.out.println("Substring (0 to 4): " + str.substring(0, 4));

         
        System.out.println("Trimmed: '" + str.trim() + "'");

        System.out.println("CharAt: '" + str.charAt(3) + "'");
    }
}

