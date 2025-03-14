package Basic.Problems;
import java.util.*;
import static java.lang.System.out;

public class NaturalNum {

    public void naturalnum(int n){
        for(int i = 1 ; i <= n ;i++){
            out.println(i + " ") ;
        }
        System.out.println("");
    }

    public static void main( String[] args){

        Scanner sc = new Scanner(System.in) ;

        NaturalNum func = new NaturalNum() ;

        int n = sc.nextInt();

        func.naturalnum(n);

        sc.close() ;

    }
}
