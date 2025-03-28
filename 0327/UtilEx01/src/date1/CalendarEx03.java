package date1;

import java.util.Calendar;

public class CalendarEx03 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime().toLocaleString());

        // add
        cal.add(Calendar.YEAR, 1);
        System.out.println(cal.getTime().toLocaleString());

        cal.add(Calendar.YEAR, -1);
        System.out.println(cal.getTime().toLocaleString());
    }
}
