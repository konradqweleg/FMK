import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostTest {
    @Test void checkDayCost(){
        Cost dayCost =new Cost(1200,CostDuration.DAY);
        assertEquals(1200,dayCost.getDayCost());



    }


    @Test void checkWeekCost(){
        Cost dayCost =new Cost(1200,CostDuration.WEEK);
        assertEquals(1200,dayCost.getWeekCost());



    }




}