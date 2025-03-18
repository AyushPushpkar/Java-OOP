package Basic.AccessModifiers.package2;

import Basic.AccessModifiers.package1.AccessModEx;

public class DifferentPackageChild extends AccessModEx {
    public void display() {
        // System.out.println(privateVar); // ❌ Not accessible
        // System.out.println(defaultVar); // ❌ Not accessible (different package)
        System.out.println(protectedVar); // ✅ Accessible (subclass)
        System.out.println(publicVar);    // ✅ Accessible (public)
    }
}