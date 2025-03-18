package Basic.String;

import static java.lang.System.out;

class CountWord{

    void count(String S){
        int cnt = 0 ; 
        int left = 0 ;

        char[] arr = S.toCharArray(); 
        int n = arr.length;

        while(left<=n-1){
            if(left != 0 && arr[left-1] == ' ' ){
                cnt++ ;
            }
            else if(left == 0 && arr[left] != ' '){
                cnt++ ;
            }
            left++ ;
        }

        out.println(cnt);
    }
}

public class cntWords {
    public static void main( String[] args){

        String S = " abc dhbeb xmkcn ljcnjc cdkbs jksbj " ;
        
        CountWord func = new CountWord() ;

        func.count(S);

    }
}
