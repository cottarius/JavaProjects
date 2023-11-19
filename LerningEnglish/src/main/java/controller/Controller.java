package controller;

import data.DataFileOperation;
import view.View;

import java.util.HashMap;

public class Controller {
    AudioFilePlayer player;
    View view;
    HashMap<String, String> map;
    DataFileOperation fileOperation;

    public Controller() {
        this.view = new View();
        this.map = new HashMap<>();
        this.fileOperation = new DataFileOperation();
        this.player = new AudioFilePlayer();
    }

    public void start() {
        view.run();
        String stateMenu;
        while (true) {
            stateMenu = view.inputString();
            switch (stateMenu) {
                case "1":
                {
                    fileOperation.readFromFile(map);
                  //  map.
                    for (String key : map.keySet()) {
                        System.out.printf("%s - %s\n", key, map.get(key));
                        player.play(String.format("%s.mp3", key));
                        System.out.print("Нажмите Enter для продолжения");
                        view.inputString();
                    }
                }
                case "0": System.exit(0);
                default:
                    System.out.println("Выбран неверный пункт меню!");


            }
        }
    }

}
