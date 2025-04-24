import java.time.Month;
import java.time.Year;


public class YearMonth {
    private int Year;
    private int Month;

    public YearMonth(int year, int month) {
        Year = year;
        Month = month;
    }

    public YearMonth(String yearMonth) {
        Year= Integer.parseInt(yearMonth.substring(0,4));
        Month=Integer.parseInt(yearMonth.substring(4,6));
    }

    public int getYear() {
        return Year;
    }

    public int getMonth() {
        return Month;
    }
}
