public class SwitchEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        int score = 82;
        
        //System.out.println( score / 10);
        // byte, short, int, long
        switch(score / 10) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        System.out.println("끝");
    }
}
