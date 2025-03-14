package Basic.Problems;

class Test {
    private int a, b, c, d;

    // Parameterized constructor
    public Test(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Methods to get individual values
    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }
    public int getD() { return d; }
}

// Demo class to create and display Test object values
class Demo {
    public static void main(String args[]) {
        Test obj = new Test(10, 20, 30, 40);

        System.out.println( obj.getA());
        System.out.println("Value of b: " + obj.getB());
        System.out.println("Value of c: " + obj.getC());
        System.out.println("Value of d: " + obj.getD());
    }
}
