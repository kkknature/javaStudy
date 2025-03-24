public class IfEx07 {
    public static void main(String[] args) {
        System.out.println("시작");

        int percentage = 68;

        if(percentage >= 90) {
            System.out.println("A+ Grade");

        } else if(percentage >= 80) {
            System.out.println("A Grade");

        } else if(percentage >= 70) {
            System.out.println("B Grade");

        } else if(percentage >= 60) {
            System.out.println("C Grade");

        } else if(percentage >= 50) {
            System.out.println("D Grade");

        } else {
            System.out.println("F Grade");
        }

        System.out.println("끝");
    }
}
