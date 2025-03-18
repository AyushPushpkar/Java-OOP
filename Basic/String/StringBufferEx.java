package Basic.String;

//Thread-safe – Methods are synchronized, making it safe for multi-threaded environments

public class StringBufferEx {
    public static void main(String[] args) {
        // 1. Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // 2. Append - Adding text
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // 3. Insert - Adding at a specific position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // 4. Replace - Changing a portion of text
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb); // Output: Hello C++ World

        // 5. Delete - Removing a portion of text
        sb.delete(6, 10);
        System.out.println("After delete: " + sb); // Output: Hello World

        // 6. Reverse - Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // 7. Capacity - Checking buffer size
        System.out.println("Buffer capacity: " + sb.capacity()); // Default: 16 + initial length
    }
}
