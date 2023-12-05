package app.view;

import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String getContent() {
        System.out.print("\uD83D\uDDA5\uFE0F   Введи текст: ");
        return scanner.nextLine();
    }

    public String getFileName() {
        System.out.print("\uD83D\uDDA5\uFE0F   Введи назву .txt файлу: ");
        return scanner.nextLine();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
