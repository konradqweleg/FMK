public interface ExpenseInterface {
    public long  getWeekCost();
    public long  getDayCost();
    public long  getMonthCost();
    public long  getYearCost();
    public long  getAllRemainingCost();
    public long  getAllExpenseCost();

    public String getNameExpense();
    public int getRemainingDay();
    public int getRemainingMonth();
    public int getRemainingWeek();
    public int getRemainingYears();
    public String getStringRepresentations();

}
