package Basic;

public class ControlFlow {

    public static int sum(int a, int b) {
        return a + b; // Return sum and exit method
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue; // Skip printing 2
            }
            if (i == 4) {
                break; // Stop the loop when i is 4
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop finished!");

        System.out.println("Sum: " + sum(5, 7));
    }
}

