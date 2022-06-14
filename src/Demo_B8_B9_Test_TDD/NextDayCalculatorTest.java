package Demo_B8_B9_Test_TDD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Case 1/1/2018")
    public void test1() {
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "2/1/2018";
        assertEquals(expected, result);
}
    @Test
    @DisplayName("Case 29/2/2020")
    public void test2() {
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/3/2020";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 28/2/2018")
    public void test3() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/3/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 31/1/2018")
    public void test4() {
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/2/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 31/12/2018")
    public void test5() {
        int dayTest = 31;
        int monthTest = 12;
        int yearTest = 2018;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/1/2019";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Case 30/12/2018")
    public void test6() {
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/5/2018";
        assertEquals(expected, result);
    }




}