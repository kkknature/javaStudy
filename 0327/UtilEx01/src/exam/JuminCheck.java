package exam;

public class JuminCheck {
    public static void main(String[] args) {

        String[] numbers = args[0].split("-");

        if (numbers[0].length() != 6) {
            System.out.println("입력 오류");
        } else if (numbers[1].length() != 7) {
            System.out.println("입력 오류");
        } else {
            System.out.println("정상 입력");

            int i1 = Integer.parseInt(numbers[0].substring(0, 1));
            int i2 = Integer.parseInt(numbers[0].substring(1, 2));
            int i3 = Integer.parseInt(numbers[0].substring(2, 3));
            int i4 = Integer.parseInt(numbers[0].substring(3, 4));
            int i5 = Integer.parseInt(numbers[0].substring(4, 5));
            int i6 = Integer.parseInt(numbers[0].substring(5, 6));

            }
        }
    }
}
