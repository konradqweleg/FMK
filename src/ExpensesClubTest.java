import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExpensesClubTest {

    private ExpensesClub expensesClub;

    private ExpensesClubTest(){
        expensesClub = new ExpensesClub();
        Expense expense = new Expense(new Cost(10_000,CostDuration.WEEK),"Oświetlenie stadionu",
                LocalDate.of(2019,7,8),LocalDate.of(2022,7,8));
        expensesClub.addNewExpenses( expense);


    }


    @Test
    void  addNewExpenseTestAndGetDayCost(){
        assertEquals(1429,expensesClub.getSumDayCost());
    }

    @Test
    public void getSumWeekCostTest(){
        assertEquals(10_000,expensesClub.getSumWeekCost());
    }

    @Test
    public void getSumMonthCostTest(){
        assertEquals(44_286,expensesClub.getSumMonthCost());
    }

    @Test
    public void getSumYearsCostTest(){
        assertEquals(531_432,expensesClub.getSumYearCost());
    }

}