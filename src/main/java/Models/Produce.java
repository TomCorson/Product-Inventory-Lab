package Models;

public class Produce {

    private int idNum;
    private String type;
    private int quantity;



    public Produce() {

    }
    public Produce(int IdNum, String type, int quantity) {
        this.idNum = IdNum;
        this.type = type;
        this.quantity = quantity;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void setIdNum(int id) {
        this.idNum = id;
    }

    public int getIdNum() {
        return this.idNum;
    }

    public void setQuantity(int amount) {
        this.quantity = amount;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString(){
        return "Id: " + this.getIdNum() + "Type: " + this.type + "Quantity: "+this.quantity;
    }
}
