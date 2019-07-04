import java.util.Locale;

public class Currency implements CurrencyInterface {

    private java.util.Currency currency;
    private double prizeInRelationToThePolishZloty;
    private static final Locale POLAND_LOCALE=new Locale("pl", "PL");

    public Currency(String nameCurrency,double prizeInRelationToThePolishZloty){
        this.currency= java.util.Currency.getInstance(nameCurrency);
        this.prizeInRelationToThePolishZloty=prizeInRelationToThePolishZloty;

    }

    @Override
    public  double getPriceInRelationToThePolishZloty(){
        return prizeInRelationToThePolishZloty;
    };

    @Override
    public  String getNameCurrency(){
        return currency.getDisplayName(POLAND_LOCALE);
    }

    @Override
    public String getSymbol(){
        return currency.getSymbol(POLAND_LOCALE);
    }


}
