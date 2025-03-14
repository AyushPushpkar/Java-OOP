package Basic.Problems;

class BOARD {
     double value;

    // Constructor to initialize value
    public BOARD(double value) {
        this.value = value;
    }

    // Display method to show the value
    public void Display() {
        System.out.println("Board Value: " + value);
    }
}

//class to create and display BOARD objects
public class ObjArr {
    public static void main(String args[]) {
        // Creating an array of BOARD objects
        BOARD boards[] = new BOARD[5];

        // Initializing objects
        boards[0] = new BOARD(10.5);
        boards[1] = new BOARD(20.75);
        boards[2] = new BOARD(30.25);
        boards[3] = new BOARD(40.50);
        boards[4] = new BOARD(50.0);

        // Displaying values of all objects
        for (int i = 0; i < boards.length; i++) {
            boards[i].Display();
        }
    }
}

