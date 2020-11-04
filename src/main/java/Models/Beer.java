package Models;

public class Beer {
    private int idNum;
    private String type;
    private int quantity;


    public Beer(){

    }

    public Beer(int IdNum, String type, int quantity) {
        this.idNum = IdNum;
        this.type = type;
        this.quantity = quantity;
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type =type;
    }

    public void setQuantity(int amount) {
        this.quantity=amount;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setIdNum(int id) {
        this.idNum=id;
    }

    public int getIdNum() {
        return this.idNum;
    }
}
