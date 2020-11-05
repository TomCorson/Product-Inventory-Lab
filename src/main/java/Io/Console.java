package Io;

import java.util.Scanner;
import Models.Produce;
import Services.ProduceServices;
public class Console {
    public ProduceServices produceServicesObj = new ProduceServices();
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




}

