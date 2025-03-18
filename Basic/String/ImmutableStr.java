package Basic.String;

public class ImmutableStr {
    public static void main(String[] args) {
        String name = "Ram"; 
        name.concat("Shyam"); 
        System.out.println(name); // Output: Ram

        name = name.concat("Shyam"); 
        System.out.println(name); // Output: RamShyam

    }
}

