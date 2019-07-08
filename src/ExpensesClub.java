import java.util.ArrayList;
import java.util.List;

public class ExpensesClub implements ExpensesClubInterface {
    List<Expense> allExpense;

    ExpensesClub(){
        allExpense= new ArrayList<>();
    }

    @Override
    public void addNewExpenses(Expense expense){
        this.allExpense.add(expense);
    }

    @Override
    public long getSumDayCost(){
       return allExpense.stream().mapToLong(cost -> cost.getDayCost()).sum();
    }


    @Override
    public long getSumWeekCost()
    {
        return allExpense.stream().mapToLong(cost -> cost.getWeekCost()).sum();
    }


    @Override
    public long getSumMonthCost()
    {
        return allExpense.stream().mapToLong(cost -> cost.getMonthCost()).sum();
    }

    @Override
    public long getSumYearCost(){
        return allExpense.stream().mapToLong(cost->cost.getYearCost()).sum();
    }
}
