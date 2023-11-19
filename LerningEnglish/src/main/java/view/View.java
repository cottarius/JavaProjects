package view;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public void run(){
        System.out.println("Добро пожаловать в тренажёр!");
        System.out.println("""
                Выберите операцию:
                1. Старт
                0. Выход
                """);
    }
    public String inputString(){
        return in.nextLine();
    }
}
