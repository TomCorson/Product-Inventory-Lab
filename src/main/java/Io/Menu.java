package Io;

import java.util.Scanner;
public ProduceServices produceServicesObj = new ProduceServices();
public class Menu {
    public static void printer(){
        System.out.println("1:Add item 2:List existing products 3:Update products \n" +
                "4:Delete products 5:Product report 6:Exit menu\n");
    }


    public static void menuSwitcher(){
        System.out.println("Enter number of menu selection:");
        Scanner input = new Scanner(System.in);
        int menuOption = input.nextInt();
        boolean exit = false;
        while(exit == false){
            switch(menuOption){
                case 1:

                    break;
                case 2:
                    //read existing products
                    break;
                case 3:
                    //updated products
                    break;
                case 4:
                    //delete products
                    break;
                case 5:
                    //get reports about products
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}
