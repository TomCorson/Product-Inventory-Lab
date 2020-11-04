package Models;

public class Beer {

    private String type;
    private int quantity;
    private int idNum;

    public Beer(){

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
