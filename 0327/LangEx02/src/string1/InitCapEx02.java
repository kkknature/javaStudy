package string1;

public class InitCapEx02 {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Usage: java InitCapEx01 <string>");
        } else {
            System.out.println("정상입력");

            Util u = new Util(args[0]);
            System.out.println(u.capitalize());
        }
    }
}
