package Basic;

// Named Constants Example in Java
class ConstantsEx {
    
    // Declaring named constants using 'final'
    static final double PI = 3.14159;  // Improves readability, avoids magic numbers
    static final int MAX_STUDENTS = 50; // Prevents accidental modification
    static final double TAX_RATE = 5.0; // Easy to update if tax rate changes
    
    public static void main(String[] args) {
        double radius = 5;
        
        // Using the constant instead of hardcoded value
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
        
        // Using MAX_STUDENTS instead of directly writing 50
        System.out.println("Maximum allowed students: " + MAX_STUDENTS);
        
        // Using TAX_RATE instead of hardcoded tax value
        double price = 100;
        double taxAmount = (TAX_RATE / 100) * price;
        System.out.println("Tax amount on $" + price + " is: $" + taxAmount);
    }
}

