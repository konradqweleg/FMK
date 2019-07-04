import java.time.LocalDate;

public class Expense {
    private Cost cost;
    private LocalDate fromTime;
    private LocalDate toTime;
    private String nameExpense;


    public Expense(Cost cost,String nameExpense,LocalDate fromTime,LocalDate toTime){
        this.cost=cost;
        this.fromTime=fromTime;
        this.toTime=toTime;
        this.nameExpense=nameExpense;

    }

    public long getDayCost(){
        return cost.getDayCost();
    }

}
