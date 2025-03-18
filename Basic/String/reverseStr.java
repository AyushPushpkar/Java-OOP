package Basic.String;
import static java.lang.System.out;

class Reverse{

    void reverse(String S){

        char[] arr = S.toCharArray(); // Convert string to character array

        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        out.println(new String(arr));
    }
}

public class reverseStr {

    public static void main( String[] args){

        String S = "ayushi" ;
        
        Reverse func = new Reverse() ;

        func.reverse(S);

    }
}
