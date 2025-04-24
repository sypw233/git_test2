import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearMonthTest {

    @Test
    public void  CreatYearMonthbyInt(){
        YearMonth yearMonth = new YearMonth(2025,4);
        assertEquals (2025,yearMonth.getYear());
        assertEquals (4,yearMonth.getMonth());
    }

    @Test
    public void  CreatYearMonthbyInt2(){
        YearMonth yearMonth = new YearMonth(2026,5);
        assertEquals (2026,yearMonth.getYear());
        assertEquals (5,yearMonth.getMonth());
    }

    @Test
    public void  CreatYearMonthbyString(){
        YearMonth yearMonth = new YearMonth("202605");
        assertEquals (2026,yearMonth.getYear());
        assertEquals (5,yearMonth.getMonth());
    }

    @Test
    public void previousMonth() {
        YearMonth yearMonth = new YearMonth(2025, 4);
        YearMonth previous = yearMonth.previous();
        assertEquals(2025, previous.getYear());
        assertEquals(3, previous.getMonth());
    }

    @Test
    public void nextMonth() {
        YearMonth yearMonth = new YearMonth(2025, 4);
        YearMonth next = yearMonth.next();
        assertEquals(2025, next.getYear());
        assertEquals(5, next.getMonth());
    }

    @Test
    public void previousMonthYearEnd() {
        YearMonth yearMonth = new YearMonth(2025, 12);
        YearMonth previous = yearMonth.previous();
        assertEquals(2025, previous.getYear());
        assertEquals(11, previous.getMonth());
    }

    @Test
    public void nextMonthYearStart() {
        YearMonth yearMonth = new YearMonth(2025, 1);
        YearMonth next = yearMonth.next();
        assertEquals(2025, next.getYear());
        assertEquals(2, next.getMonth());
    }

}
