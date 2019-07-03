public class Currency implements CurrencyInterface {
    private String name;
    private double prizeInRelationToThePolishZloty;

    public Currency(String name,double prizeInRelationToThePolishZloty){
        this.name=name;
        this.prizeInRelationToThePolishZloty=prizeInRelationToThePolishZloty;

    }

    @Override
    public  double getPriceInRelationToThePolishZloty(){
        return prizeInRelationToThePolishZloty;
    };

    @Override
    public  String getNameCurrency(){
        return name;
    }
}
