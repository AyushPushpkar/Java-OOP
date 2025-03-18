package Basic.AccessModifiers;

import Basic.AccessModifiers.package1.AccessModEx;
import Basic.AccessModifiers.package1.SamePackageChild;
import Basic.AccessModifiers.package2.DifferentPackageChild;
import Basic.AccessModifiers.package2.NonSubclass;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("🔹 Accessing from the same class:");
        AccessModEx obj1 = new AccessModEx();
        obj1.showPrivateVar(); // ✅ Allowed (indirect access to private)
        System.out.println("Public: " + obj1.publicVar); // ✅ Allowed (public)

        System.out.println("\n🔹 Accessing from same package subclass:");
        SamePackageChild obj2 = new SamePackageChild();
        obj2.display(); // ✅ Default, Protected, and Public are accessible

        System.out.println("\n🔹 Accessing from different package subclass:");
        DifferentPackageChild obj3 = new DifferentPackageChild();
        obj3.display(); // ✅ Protected and Public are accessible

        System.out.println("\n🔹 Accessing from different package (non-subclass):");
        NonSubclass obj4 = new NonSubclass();
        obj4.display(); // ✅ Only Public is accessible
    }
}

