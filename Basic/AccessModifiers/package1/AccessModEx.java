package Basic.AccessModifiers.package1;

/*Access modifiers in Java define the visibility (scope) of classes, methods, and variables. There are four access levels:

Private (private) – Accessible only within the same class
Default (Package-Private) – Accessible within the same package
Protected (protected) – Accessible within the same package + subclasses (even in different packages)
Public (public) – Accessible from anywhere */

public class AccessModEx {
    private String privateVar = "Private Variable";
    String defaultVar = "Default (Package-Private) Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    // Public method to access private variable
    public void showPrivateVar() {
        System.out.println(privateVar);
    }
}

