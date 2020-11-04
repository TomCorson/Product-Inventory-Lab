package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProduceTest {

    @Test
    public void setTypeTest(){
        String expected = "Apple";
        Produce testProduce = new Produce();
        testProduce.setType(expected);
        Assertions.assertEquals(expected,testProduce.getType());
    }
    @Test
    public void setIdNumTest(){
        int expected = 382912;
        Produce testProduce = new Produce();
        testProduce.setIdNum(expected);
        int actual = testProduce.getIdNum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setQuantityTest(){
        int expected = 4;
        Produce testProduce = new Produce();
        testProduce.setQuantity(expected);
        int actual = testProduce.getQuantity();
        Assertions.assertEquals(expected,actual);
    }
}
