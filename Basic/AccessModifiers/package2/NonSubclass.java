package Basic.AccessModifiers.package2;

import Basic.AccessModifiers.package1.AccessModEx;

public class NonSubclass {
    public void display() {
        AccessModEx obj = new AccessModEx();
        // System.out.println(obj.privateVar); // ❌ Not accessible
        // System.out.println(obj.defaultVar); // ❌ Not accessible
        // System.out.println(obj.protectedVar); // ❌ Not accessible
        System.out.println(obj.publicVar); // ✅ Accessible (public)
    }
}