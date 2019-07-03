import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CurrencyManager implements CurrencyManagerInterface {
    private static CurrencyInterface currency;
    private static CurrencyManagerInterface currencyManager;

    private static final String NAME_SETTINGS_FILE="settings\\CurrentChoiceCurrency.json";
    private CurrencyManager(){};


    private  void changeCurrency(CurrencyInterface currencyChange){
        currency=currencyChange;

    }

    @Override
    public  void loadSettingsFromFile(){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(NAME_SETTINGS_FILE))
        {
            Object obj = jsonParser.parse(reader);
            JSONArray currencyChoice = (JSONArray) obj;

            currencyChoice.forEach( cuchoice -> parseCurrencyChoice( (JSONObject) cuchoice ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private  void parseCurrencyChoice(JSONObject currencyCurrentChoice){

        JSONObject currencyObject = (JSONObject) currencyCurrentChoice.get("currency");

        String nameCurrency;
        nameCurrency = (String) currencyObject.get("currencyName");


        double prizeInRelationToThePolishZloty;
        prizeInRelationToThePolishZloty = (Double) currencyObject.get("prizeInRelationToThePolishZloty");

        CurrencyInterface currency=new Currency(nameCurrency,prizeInRelationToThePolishZloty);

        changeCurrency(currency);


    }

    @Override
    public double changePriceOnThisCurrency(double prize){
        double exceptPrizeInChangeCurrency = prize/currency.getPriceInRelationToThePolishZloty();
        exceptPrizeInChangeCurrency *= 100;
        exceptPrizeInChangeCurrency = Math.floor(exceptPrizeInChangeCurrency);
        exceptPrizeInChangeCurrency /= 100;
        return exceptPrizeInChangeCurrency;

    }

    @Override
    public String getNameCurrency(){
       return currency.getNameCurrency();
    }


    public static CurrencyManagerInterface newInstanceCurrencyManager(){
        if(currencyManager!=null){
            return currencyManager;
        }else{
            currencyManager=new CurrencyManager();
            currencyManager.loadSettingsFromFile();
            return currencyManager;

        }

    }
}
