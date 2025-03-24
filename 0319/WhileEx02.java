public class WhileEx02 {
    public static void main(String[] args) {
        
        int i = 0;
        int sum = 0;

        while(i <= 100) {
            sum += i;
            i += 2;
        }

        /*
        while(i <= 100) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
         */

        System.out.println(sum);
    }
}
