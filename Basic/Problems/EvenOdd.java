package Basic.Problems;
import java.util.*;
import static java.lang.System.out;

public class EvenOdd {
    public void even(){
        for(int i = 2 ; i <= 100 ;i+=2){
            out.print(i + " ") ;
        }
        out.println("");
    }

    public void odd(){
        for(int i = 1 ; i <= 100 ;i+=2){
            out.print(i + " ") ;
        }
        out.println("");
    }

    public static void main( String[] args){

        Scanner sc = new Scanner(System.in) ;

        EvenOdd func = new EvenOdd() ;

        out.println("enter 1 for odd or 2 for even");

        int n = sc.nextInt();

        switch (n) {
            case 1 : func.odd();
                break;
            case 2 : func.even() ;
                break;
            default: out.println("enter valid input");
                break;
        }

        sc.close() ;

    }
}
