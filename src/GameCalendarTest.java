import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameCalendarTest {

    @Test void createGameCalendarInstanceTest(){
        assertNotNull(GameCalendar.instanceGameCalendar());
    }

    @Test void addDaysTest(){
        GameCalendar.addDaysToActualDate(200);
        LocalDate dateTemp = LocalDate.of(2019,7,7);
        dateTemp=dateTemp.plusDays(200);
        assertEquals(dateTemp,GameCalendar.getActualGameDate());
    }
}
