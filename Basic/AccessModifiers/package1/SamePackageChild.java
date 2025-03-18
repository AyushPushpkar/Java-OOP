package Basic.AccessModifiers.package1;

public class SamePackageChild extends AccessModEx {
    public void display() {
        // System.out.println(privateVar); // ❌ Not accessible (private)
        System.out.println(defaultVar);   // ✅ Accessible (same package)
        System.out.println(protectedVar); // ✅ Accessible (same package)
        System.out.println(publicVar);    // ✅ Accessible (public)
    }
}
