import static java.lang.System.out;

public class Test {
    public void arrout(String args[]) 
    {
        int array_variable [] = new int[10];
    for (int i = 0; i < 10; ++i) {
            array_variable[i] = i;
            System.out.print(array_variable[i] + " ");
            i++;
        }
    }
    public static void main(String args[]) {

        int array_variable [] = new int[10];
	    for (int i = 0; i < 10; ++i) 
            {
                array_variable[i] = i;
                System.out.print(array_variable[i] + " ");
                i++;
            }out.println();


        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);


    }

}
