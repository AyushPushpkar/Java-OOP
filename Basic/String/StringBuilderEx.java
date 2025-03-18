package Basic.String ;

//Unlike String, StringBuilder is mutable, meaning it can be modified without creating a new object

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        sb.append(" World");  
        System.out.println("After append: " + sb);

        sb.insert(5, " Java");  
        System.out.println("After insert: " + sb);

        sb.replace(6, 10, "Python");  
        System.out.println("After replace: " + sb);

        sb.delete(5, 12);  
        System.out.println("After delete: " + sb);

        sb.reverse();  
        System.out.println("After reverse: " + sb);
    
    }
}
