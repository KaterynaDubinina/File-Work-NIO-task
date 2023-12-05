package app;

import app.controller.AppController;
import java.util.Scanner;

public class App {

    static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("\n\uD83D\uDC9B Вітаю у застосунку для запису і читання файлів \uD83D\uDC99");
        int option;
        do {
            option = getApp();
        } while (option != 1 && option != 2);

        runApp(option);
    }

    private static int getApp() {
        System.out.print("""
                
                \uD83D\uDDA5\uFE0F   Тисни:
                1\uFE0F\u20E3   Щоб створити і записати \uD83D\uDCE8
                2\uFE0F\u20E3   Щоб читати \uD83D\uDCE9
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runApp(int option) {
        switch (option) {
            case 1 -> {
                AppController controller = new AppController();
                controller.getWrite();
            }
            case 2 -> {
                AppController controller = new AppController();
                controller.getRead();
            }
            default -> System.out.println("Такої опції немає");
        }
    }
}
