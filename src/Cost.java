public class Cost implements CostInterface {
    private double cost;
    private static final double DAY_OF_WEEK=7;

    public Cost(long amount,CostDuration costDuration){

        if(costDuration==CostDuration.WEEK){
            cost=amount/DAY_OF_WEEK;
        }else{
            cost=amount;
        }


    }

    @Override
    public double getDayCostDouble(){
        return cost;
    }

    @Override
    public long getDayCost(){
        return Math.round(cost);
    }

    @Override
    public long getWeekCost(){


        return Math.round(cost * DAY_OF_WEEK);
    }
}
