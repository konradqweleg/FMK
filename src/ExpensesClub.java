import java.util.ArrayList;
import java.util.Iterator;
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
        checkIfReleaseCosts();
        return allExpense.stream().mapToLong(cost -> cost.getDayCost()).sum();
    }

    private void checkIfReleaseCosts(){


        Iterator itr = allExpense.iterator();
        while (itr.hasNext())
        {
            Expense exp = (Expense)itr.next();
            if (exp.getRemainingDay() < 0)
                itr.remove();
        }
    }


    @Override
    public long getSumWeekCost()
    {    checkIfReleaseCosts();
        return allExpense.stream().mapToLong(cost -> cost.getWeekCost()).sum();
    }


    @Override
    public long getSumMonthCost()
    {    checkIfReleaseCosts();
        return allExpense.stream().mapToLong(cost -> cost.getMonthCost()).sum();
    }

    @Override
    public long getSumYearCost(){
        checkIfReleaseCosts();
        return allExpense.stream().mapToLong(cost->cost.getYearCost()).sum();
    }
}
