import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyManagerTest {

    @Test
    public void loadSettingsFromFileTestAndNameTest(){
        CurrencyManagerInterface currencyManager = CurrencyManager.newInstanceCurrencyManager();
        currencyManager.loadSettingsFromFile();
        assertEquals("Euro",currencyManager.getNameCurrency());



    }

    @Test
    public void changePriceOnThisCurrencyTest(){
        CurrencyManagerInterface currencyManager = CurrencyManager.newInstanceCurrencyManager();
        currencyManager.loadSettingsFromFile();
        double prizeInEuro=currencyManager.changePriceOnThisCurrency(10.00);
        assertEquals(2.35, prizeInEuro);
    }

    @Test
    public void newInstanceCurrencyManagerTest(){
        CurrencyManagerInterface currencyManager = CurrencyManager.newInstanceCurrencyManager();
        assertNotNull(currencyManager);




    }

}