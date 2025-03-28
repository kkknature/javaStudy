package date1;

import java.util.Date;

public class DateEx02 {
    public static void main(String[] args) {

        // 2025년 5월 1일
        Date date1 = new Date(2025-1900, 5-1, 1);
        Date date2 = new Date(2025-1900, 5-1, 1, 10, 10, 10);

        System.out.println(date1.toLocaleString());
        System.out.println(date2.toLocaleString());

        Date date3 = new Date(2025-1900, 5-1, 0);
        System.out.println(date3.toLocaleString());

        // 2025년 12월 24일의 요일..
        Date date4 = new Date(2025-1900, 12-1, 24);
        System.out.println(date4.toLocaleString());
        System.out.println(date4.getDay()); // 한글

        switch(date4.getDay()) {
            case 0:
                System.out.println("일요일");
                break;
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
        }

        //
        Date date5 = new Date(System.currentTimeMillis());
        System.out.println(date5.toLocaleString());
    }
}
