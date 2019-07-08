import java.util.ArrayList;

public interface ExpensesClubInterface {


    public void addNewExpenses(Expense expense);
    public long getSumDayCost();
    public long getSumWeekCost();


    public long getSumMonthCost();

    public long getSumYearCost();


}
