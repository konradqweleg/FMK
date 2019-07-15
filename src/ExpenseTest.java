import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseTest {


  private  Expense expense;
  private  Expense expense2;

    private ExpenseTest(){
         expense = new Expense(new Cost(1000,CostDuration.WEEK),"Oświetlenie Stadionu",
                LocalDate.of(2019,7,4),LocalDate.of(2021,7,4));

        expense2 = new Expense(new Cost(1000,CostDuration.DAY),"Oświetlenie Stadionu",
                LocalDate.of(2019,7,4),LocalDate.of(2019,7,9));
    }

    @Test
    public void  getWeekCostTest(){


        assertEquals(1000,expense.getWeekCost());
    }

    @Test
    public void  getDayCostTest(){


        assertEquals(143,expense.getDayCost());



    }

    @Test
    public void  getMonthCostTest(){


        assertEquals(4429,expense.getMonthCost());


        assertEquals(2000,expense2.getMonthCost());




    }
    @Test
    public void  getYearCostTest()
    {


        assertEquals(52_286,expense.getYearCost());



        assertEquals(2000,expense2.getYearCost());

    }

    @Test
    public void  getAllRemainingCostTest()
    {


        assertEquals(104_000,expense.getAllRemainingCost());

    }

    @Test
    public void  getAllExpenseCostTest()
    {


        assertEquals(104_429,expense.getAllExpenseCost());
    }


    @Test
    public void getNameExpenseTest()
    {

        assertEquals("Oświetlenie Stadionu",expense.getNameExpense());

    }

    @Test
    public void getRemainingDayTest(){

        assertEquals(728,expense.getRemainingDay());

    }
    @Test
    public void getRemainingMonthTest(){

        assertEquals(23,expense.getRemainingMonth());

    }
    @Test
    public void getRemainingWeekTest()
    {

        assertEquals(104,expense.getRemainingWeek());
    }
    @Test
    public void getRemainingYearsTest(){

        assertEquals(1,expense.getRemainingYears());

    }

    @Test
    public void getStringRepresentations(){
        assertEquals("1 rok 11 miesięcy 3 tygodnie 6 dni ",expense.getStringRepresentations());
    }


}