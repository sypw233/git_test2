
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
}
