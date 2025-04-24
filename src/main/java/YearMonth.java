import java.time.LocalDate;
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
        this(Integer.parseInt(yearMonth.substring(0,4)),
                Integer.parseInt(yearMonth.substring(4,6)
                )
        );
    }

    public YearMonth(LocalDate dateTime) {
        this(dateTime.getYear(), dateTime.getMonthValue());
    }

    public int getYear() {
        return Year;
    }

    public int getMonth() {
        return Month;
    }


    public YearMonth previous() {
        if (Month == 1) {
            return new YearMonth(Year - 1, 12);
        } else {
            return new YearMonth(Year, Month - 1);
        }
    }

    public YearMonth next() {
        if (Month == 12) {
            return new YearMonth(Year + 1, 1);
        } else {
            return new YearMonth(Year, Month + 1);
        }
    }

}
