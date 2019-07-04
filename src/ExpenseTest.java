import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseTest {

    /*
    @Test void checkExpectValueExpenseinPeriodDate(){
        Expense expense = new Expense(1000,"Koszta oświetlenia", LocalDate.of(2019,7,4),
                LocalDate.of(2021,7,11));

        long dayCost= expense.getDayCost();
        assertEquals();

        long weekCost= expense.getWeekCost();
        assertEquals(1000,weekCost);

        long monthCost = expense.getMonthCost();
        assertEquals(4000,monthCost);

        long yearsCost = expense.getYearsCost();
        assertEquals(48000,yearsCost);

    }


    @Test void checkExpectName(){
        Expense expense = new Expense(1000,"Koszta oświetlenia");
        assertEquals("Koszta oświetlenia",expense.getNameExpense());

    }
*/

    public void  getWeekCostTest(){

    }

    @Test
    public void  getDayCostTest(){
        Expense expense = new Expense(new Cost(1000,CostDuration.WEEK),"Oświetlenie Stadionu",
                LocalDate.of(2019,7,4),LocalDate.of(2021,7,4));

        assertEquals(1000,expense.getDayCost());

    }

    public void  getMonthCostTest(){

    }
    public void  getYearCostTest()
    {

    }
    public void  getAllRemainingCostTest()
    {

    }
    public void  getAllExpenseCostTest()
    {

    }
    public void  getExpenseNameTest(){

    }
    public void getNameExpenseTest()
    {

    }
    public void getRemainingDayTest(){

    }
    public void getRemainingMonthTest(){

    }
    public void getRemainingWeekTest()
    {

    }
    public void getRemainingYearsTest(){

    }


}