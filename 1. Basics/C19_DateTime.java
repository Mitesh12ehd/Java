import java.time.LocalDate;
import java.time.Month;

public class C19_DateTime {
    public static void main(String[] args) {

        // Time API is introduced in java 8
        // before java 8 there is Date,Calendar,SimpleDateFormat
        
        // Localdate: represent date
        // It is immutable, thread safe

        // Todays date
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // Create specific date
        LocalDate date = LocalDate.of(2025, 12,25);
        LocalDate date2 = LocalDate.of(2025, Month.DECEMBER, 25);
        System.out.println(date);

        // Get values from LocalDate
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());

        // Modify date
        LocalDate newDate = date.plusDays(5);   // it create new LocalDate
        
    }    
}
