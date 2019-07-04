public class Cost {
    private double cost;
    private static final double DAY_OF_WEEK=7;

    public Cost(long amount,CostDuration costDuration){

        if(costDuration==CostDuration.WEEK){
            cost=amount/DAY_OF_WEEK;
        }else{
            cost=amount;
        }

    }

    public long getDayCost(){
        return Math.round(cost);
    }


    public long getWeekCost(){
        return  Math.round(cost * DAY_OF_WEEK);
    }
}
