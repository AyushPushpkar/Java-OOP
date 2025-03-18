package Basic.String;

// Java program to demonstrate splitting a String into an array of substrings
public class StringSplitEx {
    public static void main(String[] args) {
        
        // Original string
        String text = "apple,banana,grape,orange";

        // 1. Using split(String regex) - splits the string at every comma
        String[] fruits1 = text.split(","); 
        System.out.println("Using split(String regex):");
        for (String fruit : fruits1) {
            System.out.println(fruit);
        }

        // 2. Using split(String regex, int limit) - splits only at first 2 occurrences
        String[] fruits2 = text.split(",", 2); 
        System.out.println("\nUsing split(String regex, int limit = 2):");
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }
    }
}

