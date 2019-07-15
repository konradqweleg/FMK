import java.time.LocalDate;

public class GameCalendar {
    private static  LocalDate gameDate;
    private static  GameCalendar gameCalendar;
    private  GameCalendar(){ }

    static{
        gameDate=LocalDate.of(2019,7,7);
        gameCalendar= new GameCalendar();
    }

    public static GameCalendar instanceGameCalendar(){
        if(gameCalendar==null){
            gameCalendar=new GameCalendar();
            return gameCalendar;
        }else{
            return gameCalendar;
        }


    }

    public static void addDaysToActualDate(int quantity){
      gameDate=  gameDate.plusDays(quantity);
    }

    public static LocalDate getActualGameDate(){
        return gameDate;
    }
}
