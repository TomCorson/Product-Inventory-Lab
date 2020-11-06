package Services;

import Models.Produce;
import Utils.CSVUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProduceServices {
    private static int count = 0;
    private ArrayList<Produce> inventory = new ArrayList<Produce>();

    public ProduceServices() {

    }

    public Produce create(int idNum, String type, int quantity) {
        count++;
        Produce createdProduce = new Produce(idNum, type, quantity);
        inventory.add(createdProduce);
        return createdProduce;
    }

    public Produce findProduce(int expectedIdNum) {
        for (Produce obj : inventory) {
            if (obj.getIdNum() == expectedIdNum) {
                return obj;
            }
        }
        System.out.println("Id not found");
        return null;
    }

    public String findAll() {
        return inventory.toString();
    }

    public boolean delete(int idNum) {
        for (Produce obj : inventory) {
            if (obj.getIdNum() == idNum) {
                inventory.remove(obj);
                return true;
            }
        }
        return false;
    }

    public String listProducts() {
        StringBuilder list = new StringBuilder();
        for (Produce obj : inventory) {
            list.append(obj.toString() + "\n\n");
        }
        return list.toString();
    }

    public String stockReportList() {
        StringBuilder stockList = new StringBuilder();
        for (Produce obj : inventory) {
            stockList.append(obj.getType());
            stockList.append("-");
            stockList.append(obj.getQuantity());
            stockList.append("\n");
        }
        return stockList.toString();
    }


    public void writeData() throws IOException {

        String csvFile = "/Users/tom/Dev/try.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(count))));  // (2)

        for (Produce obj : inventory) {
            List<String> list = new ArrayList<>();
            list.add(String.valueOf(obj.getType()));
            CSVUtils.writeLine(writer, list);
        }

      // (4)
        writer.flush();
        writer.close();

    }
}




