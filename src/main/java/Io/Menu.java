package Io;
import Io.Console;
import java.io.IOException;
import java.util.Scanner;
import Models.Produce;
import Services.ProduceServices;
public class Menu {
    Console startConsole = new Console();

    public Menu(){

    }

    public static void printer(){
        System.out.println("1:Add item 2:List existing products 3:Update products \n" +
                "4:Delete products 5:Current product report 6:Add data to CSV 7:Exit menu\n");
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
                    startConsole.list();
                    break;
                case 3:
                    startConsole.update();
                    break;
                case 4:
                    startConsole.delete();
                    break;
                case 5:
                    startConsole.currentStockReport();
                case 6:
                        ProduceServices testWrite = new ProduceServices();
                    try {
                        testWrite.writeData();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 7:
                    exit = true;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menuOption);
            }
        }
    }
}
