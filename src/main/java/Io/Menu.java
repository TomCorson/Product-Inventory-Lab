package Io;

import java.util.Scanner;
import Models.Produce;
import Services.ProduceServices;
public class Menu {
    Console startConsole = new Console();
    public Menu(){

    }

    public static void printer(){
        System.out.println("1:Add item 2:List existing products 3:Update products \n" +
                "4:Delete products 5:Product report 6:Exit menu\n");
    }


    public void menuSwitcher(){

        boolean exit = false;
        while(exit == false){
            printer();
            System.out.println("Enter number of menu selection:");
            Scanner input = new Scanner(System.in);
            int menuOption = input.nextInt();
            switch(menuOption){
                case 1:
                    startConsole.addOption();
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
                default:
                    throw new IllegalStateException("Unexpected value: " + menuOption);
            }
        }
    }
}
