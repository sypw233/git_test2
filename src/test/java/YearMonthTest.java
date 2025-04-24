import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearMonthTest {

    @Test
    public void  CreatYearMonthbyInt(){
        // Given: 年份2025和月份4
        int year = 2025;
        int month = 4;

        // When: 创建YearMonth对象
        YearMonth yearMonth = new YearMonth(year, month);

        // Then: 验证年份和月份是否正确
        assertEquals(year, yearMonth.getYear());
        assertEquals(month, yearMonth.getMonth());
    }

    @Test
    public void  CreatYearMonthbyInt2(){
        // Given: 年份2026和月份5
        int year = 2026;
        int month = 5;

        // When: 创建YearMonth对象
        YearMonth yearMonth = new YearMonth(year, month);

        // Then: 验证年份和月份是否正确
        assertEquals(year, yearMonth.getYear());
        assertEquals(month, yearMonth.getMonth());
    }

    @Test
    public void  CreatYearMonthbyString(){
        // Given: 年月字符串"202605"
        String yearMonthStr = "202605";

        // When: 通过字符串创建YearMonth对象
        YearMonth yearMonth = new YearMonth(yearMonthStr);

        // Then: 验证年份和月份是否正确
        assertEquals(2026, yearMonth.getYear());
        assertEquals(5, yearMonth.getMonth());
    }

    @Test
    public void previousMonth() {
        // Given: 2025年4月的YearMonth对象
        YearMonth yearMonth = new YearMonth(2025, 4);

        // When: 获取上一个月
        YearMonth previous = yearMonth.previous();

        // Then: 验证是否为2025年3月
        assertEquals(2025, previous.getYear());
        assertEquals(3, previous.getMonth());
    }

    @Test
    public void nextMonth() {
        // Given: 2025年4月的YearMonth对象
        YearMonth yearMonth = new YearMonth(2025, 4);

        // When: 获取下一个月
        YearMonth next = yearMonth.next();

        // Then: 验证是否为2025年5月
        assertEquals(2025, next.getYear());
        assertEquals(5, next.getMonth());
    }

    @Test
    public void previousMonthYearEnd() {
        // Given: 2025年12月的YearMonth对象
        YearMonth yearMonth = new YearMonth(2025, 12);

        // When: 获取上一个月
        YearMonth previous = yearMonth.previous();

        // Then: 验证是否为2025年11月
        assertEquals(2025, previous.getYear());
        assertEquals(11, previous.getMonth());
    }

    @Test
    public void nextMonthYearStart() {
        // Given: 2025年1月的YearMonth对象
        YearMonth yearMonth = new YearMonth(2025, 1);

        // When: 获取下一个月
        YearMonth next = yearMonth.next();

        // Then: 验证是否为2025年2月
        assertEquals(2025, next.getYear());
        assertEquals(2, next.getMonth());
    }
}
