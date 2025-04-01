import java.util.Calendar;
import java.util.Date;

public class DateCalendarUtils {

    public static Date getCurrentDate() {
        return new Date();
    }

    public static Calendar getCurrentCalendar() {
        return Calendar.getInstance();
    }

    public static void main(String[] args) {
        System.out.println("Current date: " + getCurrentDate());
        System.out.println("Current Calendar time: " + getCurrentCalendar().getTime());
    }
}

