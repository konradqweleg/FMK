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

    @Test void removeCostWhenEndDurationDay(){
        GameCalendar.addDaysToActualDate(1399);
       assertEquals(0,expensesClub.getSumDayCost());

    }


    @Test void bigTestClubExpensesWithChangeDate(){
        Expense expenseStation = new Expense(new Cost(25_000,CostDuration.WEEK),"Koszta Utrzymania Stadionu",
                LocalDate.of(2019,7,8),LocalDate.of(2022,7,8));
        Expense expensePlayerBuyRate = new Expense(new Cost(90_000,CostDuration.WEEK),"Koszta raty kupna piłkarza",
                LocalDate.of(2019,7,8),LocalDate.of(2022,7,8));
        Expense expenseSecurity = new Expense(new Cost(1_000,CostDuration.WEEK),"Koszta ochrony",
                LocalDate.of(2019,7,8),LocalDate.of(2022,7,8));

        ExpensesClub expensesClub2=new ExpensesClub();

        expensesClub2.addNewExpenses(expensePlayerBuyRate);
        expensesClub2.addNewExpenses(expenseSecurity);
        expensesClub2.addNewExpenses(expenseStation);



        assertEquals(16_571,expensesClub2.getSumDayCost());

        GameCalendar.addDaysToActualDate(9000);
        assertEquals(0,expensesClub2.getSumDayCost());


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
        assertEquals(522_857,expensesClub.getSumYearCost());
    }

}