package Basic;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 2 == 0) {
                i++; // Increment before continue to avoid infinite loop
                continue; // Skip even numbers
            }

            System.out.println("Odd Number: " + i);

            if (i == 7) {
                break; // Stop the loop when i is 7
            }

            i++; // Increment i
        } while (i <= 10);
        
        System.out.println("Loop exited!");

        int x = 10;

        do {
            System.out.println("This runs once!");
        } while (x < 5); // Condition is false, but loop runs once
    }
}

