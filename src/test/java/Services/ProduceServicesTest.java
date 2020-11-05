package Services;

import Models.Produce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProduceServicesTest {

    @Test
   public void createTest() {
        int expectedIdNum = 211189;
        String expectedType = "Banana";
        int expectedQuantity = 10;

        ProduceServices produceServicesObj = new ProduceServices();
        Produce testProduce = produceServicesObj.create(expectedIdNum,expectedType,expectedQuantity);

        int actualIdNum = testProduce.getIdNum();
        String actualType = testProduce.getType();
        int actualQuantity = testProduce.getQuantity();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualIdNum).getClass().getName());
        Assertions.assertEquals(expectedIdNum,actualIdNum);
        Assertions.assertEquals(expectedType,actualType);
        Assertions.assertEquals(expectedQuantity,actualQuantity);
    }
    @Test
    public void findProduce(){
        int expectedIdNum = 1201;
        String expectedType = "grapes";
        int expectedQuantity = 900;
        ProduceServices testProduceServices = new ProduceServices();
        Produce testProduce = testProduceServices.create(expectedIdNum,expectedType,expectedQuantity);
        Produce actualResults = testProduceServices.findProduce(1201);
        Produce expectedResults = testProduce;
        Assertions.assertEquals(expectedResults,actualResults);
    }
    @Test
    public void findAllTest(){
        ProduceServices groupObj = new ProduceServices();
        Produce beetsObj = groupObj.create(333,"beets",2);
        Produce carrotObj = groupObj.create(4829,"carrot",28);
        Produce cabbageObj = groupObj.create(112, "cabbage",40);

        String actual = groupObj.findAll();
        String expected = "[Id: 333Type: beetsQuantity: 2, Id: 4829Type: carrotQuantity: 28, Id: 112Type: cabbageQuantity: 40]";

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void deleteTest(){
        ProduceServices testPS = new ProduceServices();
        Produce turnip = testPS.create(405,"turnip",33);
        Produce onion = testPS.create(818,"onion", 20);

        boolean actual = testPS.delete(405);
        boolean expected = true;
        Assertions.assertEquals(expected,actual);

    }

}
