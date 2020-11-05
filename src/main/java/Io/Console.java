package Io;

import java.util.ArrayList;
import java.util.Scanner;
import Models.Produce;
import Services.ProduceServices;
public class Console {
     ProduceServices produceServicesObj = new ProduceServices();
     ArrayList<Produce> report = new ArrayList<Produce>();
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");
    }

    public void addOption(){
        System.out.println("Enter id number:");
        Scanner idNumScan = new Scanner(System.in);
        int idNum = idNumScan.nextInt();
        System.out.println("Enter product type:");
        Scanner typeScan = new Scanner(System.in);
        String type = typeScan.nextLine();
        System.out.println("Enter quantity:");
        Scanner quantityScan = new Scanner(System.in);
        int quantity = quantityScan.nextInt();

        produceServicesObj.create(idNum,type,quantity);
        System.out.println(type + " added");
    }
    public void list(){
       String list = produceServicesObj.listProducts();
        System.out.println(list);
    }

    public void update(){
            System.out.println("Enter item Id number");
            Scanner idScan = new Scanner(System.in);
            int id = idScan.nextInt();
            Produce obj = produceServicesObj.findProduce(id);
            System.out.println(obj.toString());

            System.out.println("Update Id number or re-enter");
            Scanner idScanUpdate = new Scanner(System.in);
            int idUpdate = idScanUpdate.nextInt();
            obj.setIdNum(idUpdate);

            System.out.println("Update Type or re-enter");
            Scanner typeUpdateScan = new Scanner(System.in);
            String typeUpdate = typeUpdateScan.nextLine();
            obj.setType(typeUpdate);

            System.out.println("Update quantity or re-enter");
            Scanner quantityUpdateScan = new Scanner(System.in);
            int quantityUpdate = quantityUpdateScan.nextInt();
            obj.setQuantity(quantityUpdate);

            System.out.println("Updated item:");
            System.out.println(obj.toString());

    }

    public void delete() {
        System.out.println("Enter id number to delete");
        Scanner deleter = new Scanner(System.in);
        int deleterId = deleter.nextInt();
        if (produceServicesObj.delete(deleterId)) {
            Produce objDeleted = produceServicesObj.findProduce(deleterId);
            report.add(objDeleted);
            produceServicesObj.delete(deleterId);
            System.out.println("Produce item deleted.");
        } else {
            System.out.println("Id not found");
        }
    }
        public void currentStockReport(){
        System.out.println(produceServicesObj.stockReportList());
        }


    }






