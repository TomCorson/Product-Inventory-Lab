package Io;

import Services.ProduceServices;

import java.io.IOException;

public class App {


    public static void main(String... args){
        App application = new App();
        application.init();
    }

    public void init(){

        Menu startMenu = new Menu();
        startMenu.menuSwitcher();

    }
}
