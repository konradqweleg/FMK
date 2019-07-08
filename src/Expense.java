import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.*;

public class Expense implements ExpenseInterface {
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

    @Override
    public long getDayCost(){
        return cost.getDayCost();
    }

    private long getCostOfPeriod(LocalDate until){
        if(until.compareTo(toTime)>0){
            long daysToExpiry=DAYS.between(GameCalendar.getActualGameDate(),toTime);
            return Math.round(daysToExpiry*cost.getDayCostDouble());

        }else{
            long daysBetweenWeek= DAYS.between(GameCalendar.getActualGameDate(),until);
            return Math.round(daysBetweenWeek*cost.getDayCostDouble());
        }
    }
    @Override
    public long getWeekCost(){
        LocalDate dateAddWeek=GameCalendar.getActualGameDate().plusWeeks(1);

        return getCostOfPeriod(dateAddWeek);




    }
    @Override
    public long  getMonthCost(){
        LocalDate dateAddMonth=GameCalendar.getActualGameDate().plusMonths(1);

        return getCostOfPeriod(dateAddMonth);
    }


    @Override
    public long  getYearCost(){
        LocalDate dateAddYear=GameCalendar.getActualGameDate().plusYears(1);

        return getCostOfPeriod(dateAddYear);

    }

    @Override
    public long  getAllRemainingCost(){
        long daysToExpiry=DAYS.between(GameCalendar.getActualGameDate(),toTime);
        return Math.round(daysToExpiry*cost.getDayCostDouble());
    }

    @Override
    public long  getAllExpenseCost(){
        long daysToExpiry=DAYS.between(fromTime,toTime);

        return Math.round(daysToExpiry*cost.getDayCostDouble());

    }

    @Override
    public String getNameExpense()
    {
        return nameExpense;
    }

    @Override
    public int getRemainingDay(){
        int daysToExpiry=(int)DAYS.between(GameCalendar.getActualGameDate(),toTime);

        return daysToExpiry;
    }
    @Override
    public int getRemainingMonth(){
        int monthToExpiry=(int)MONTHS.between(GameCalendar.getActualGameDate(),toTime);

        return monthToExpiry;
    }

    @Override
    public int getRemainingWeek(){
        int weekToExpiry=(int)WEEKS.between(GameCalendar.getActualGameDate(),toTime);

        return weekToExpiry;

    }
    @Override
    public int getRemainingYears(){
        int yearsToExpiry=(int)YEARS.between(GameCalendar.getActualGameDate(),toTime);

        return yearsToExpiry;
    }



    private String formatStringYearQuantity(int quantity){
        if(quantity==1){
            return " rok ";
        }else if(quantity%10==2 && quantity%10==3 &&quantity%10==4 ){
            return " lata ";
        }else{
            return " lat ";
        }

    }

    @Override
    public String getStringRepresentations(){
        StringBuilder representation = new StringBuilder();

        if(getRemainingYears() > 0 ){
            representation.append(getRemainingYears()+formatStringYearQuantity(getRemainingYears()));
        }

        if(getRemainingMonth()>0){
            int quantityMonth=getRemainingMonth()-(12*getRemainingYears());
            representation.append(quantityMonth+" Miesięcy ");
        }

        if(getRemainingWeek()>0){
           int quantityWeek=getRemainingDay();
           quantityWeek-= 365*getRemainingDay();

           representation.append(quantityWeek+" tygodni ");
        }

        if(getRemainingDay()>0){
            int quantityDay=getRemainingDay();
            quantityDay-=getRemainingWeek()*7;



            representation.append(quantityDay+" dni. ");
        }


        return representation.toString();
    }

}
