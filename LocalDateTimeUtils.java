import java.time.*;

public class LocalDateTimeUtils {

    public static LocalTime getCurrentLocalTime() {
        return LocalTime.now();
    }

    public static LocalDate getCurrentLocalDate() {
        return LocalDate.now();
    }

    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }

    public static ZonedDateTime getCurrentZonedDate() {
        return ZonedDateTime.now();
    }

    public static void main(String[] args) {
        System.out.println("Current LocalTime: " + getCurrentLocalTime());
        System.out.println("Current LocalDate: " + getCurrentLocalDate());
        System.out.println("Current LocalDateTime: " + getCurrentLocalDateTime());
        System.out.println("Current ZonedDateTime: " + getCurrentZonedDate());
    }
}
