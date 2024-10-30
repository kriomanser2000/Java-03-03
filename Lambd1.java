import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lambd1
{
    public static void main(String[] args)
    {
        LeapYearChecker isLeapYear = year -> (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("2024 leap? " + isLeapYear.check(2024));
        DaysBetweenCalculator daysBetween = (start, end) -> ChronoUnit.DAYS.between(start, end);
        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 12, 31);
        System.out.println("The days between " + date1 + " і " + date2 + ": " + daysBetween.calculate(date1, date2));
        FullWeeksBetweenCalculator fullWeeksBetween = (start, end) -> ChronoUnit.WEEKS.between(start, end);
        System.out.println("Full Sundays between " + date1 + " і " + date2 + ": " + fullWeeksBetween.calculate(date1, date2));
        DayOfWeekCalculator dayOfWeekCalculator = date -> date.getDayOfWeek();
        LocalDate moonLanding = LocalDate.of(1969, 7, 20);
        System.out.println("Day of the week for " + moonLanding + ": " + dayOfWeekCalculator.calculate(moonLanding));
    }
    @FunctionalInterface
    interface LeapYearChecker
    {
        boolean check(int year);
    }
    @FunctionalInterface
    interface DaysBetweenCalculator
    {
    long calculate(LocalDate start, LocalDate end);
    }
    @FunctionalInterface
    interface FullWeeksBetweenCalculator
    {
        long calculate(LocalDate start, LocalDate end);
    }
    @FunctionalInterface
    interface DayOfWeekCalculator
    {
        DayOfWeek calculate(LocalDate date);
    }
}
