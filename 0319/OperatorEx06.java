public class OperatorEx06 {
    public static void main(String[] args) {
        
        int a = 10;
        //a = a - 1;
        //a -= 1;
        //a--;
        --a;

        System.out.println( a);

        int a1 = 10;
        int a2 = 10;

        int b1 = ++a1;
        int b2 = a2++;

        System.out.println(a1 + " / " + b1);
        System.out.println(a2 + " / " + b2);
    }
}
