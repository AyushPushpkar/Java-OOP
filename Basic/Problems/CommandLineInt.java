package Basic.Problems;

class CommandLineInteger {
    public static void main(String args[]) {
        if (args.length > 0) {
            // Convert command-line argument (String) to Integer
            Integer num = Integer.parseInt(args[0]);
            System.out.println("Converted Integer: " + num);
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }
}

