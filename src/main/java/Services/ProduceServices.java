package Services;

import Models.Produce;

import java.util.ArrayList;

public class ProduceServices {
    private static int productNum =1;
    private ArrayList<Produce> inventory = new ArrayList<Produce>();
    public ProduceServices(){

    }

    public Produce create(int idNum, String type, int quantity) {

        Produce createdProduce = new Produce(idNum,type,quantity);

        inventory.add(createdProduce);

        return createdProduce;
    }

    public Produce findProduce(int expectedIdNum) {
        for(Produce obj: inventory) {
            if (obj.getIdNum() == expectedIdNum) {
                return obj;
            }
        }
        System.out.println("Id not found");
            return null;
    }
    public String findAll(){

        return inventory.toString();
        }
    public boolean delete(int idNum){
    for(Produce obj: inventory) {
        if (obj.getIdNum() == idNum) {
            inventory.remove(obj);
            return true;
        }
    }
    return false;
}
    public String listProducts(){
        StringBuilder list = new StringBuilder();
                for(Produce obj: inventory){
                   list.append(obj.toString() + "\n\n");
                }
                return list.toString();
    }
    public String stockReportList(){
        StringBuilder stockList = new StringBuilder();
        for(Produce obj: inventory){
            stockList.append(obj.getType());
            stockList.append("-");
            stockList.append(obj.getQuantity());
            stockList.append("\n");
        }
        return stockList.toString();
    }
}



