package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeerTest {

    @Test
    public void setTypeTest(){
        String expected = "Lager";
        Beer testBeer = new Beer();
        testBeer.setType(expected);
        String actual = testBeer.getType();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setQuantityTest(){
        int expected = 6;
        Beer testBeer = new Beer();
        testBeer.setQuantity(expected);
        int actual = testBeer.getQuantity();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setIdNumTest(){
        int expected = 1259;
        Beer testBeer = new Beer();
        testBeer.setIdNum(expected);
        int actual = testBeer.getIdNum();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void constructorTest(){
        int expectedIdNum = 2222;
        String expectedType = "Porter";
        int expectedQuantity = 12;

        Beer testBeer = new Beer(expectedIdNum,expectedType,expectedQuantity);

        Assertions.assertEquals(expectedIdNum,testBeer.getIdNum());
        Assertions.assertEquals(expectedType, testBeer.getType());
        Assertions.assertEquals(expectedQuantity,testBeer.getQuantity());
    }
}
