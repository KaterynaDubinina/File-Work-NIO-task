package app.model;

import utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {

    public static String readFromFile(String fileName) {
        String strPath = Constants.PATH_OUT + fileName;
        try {
            return Files.readString(Path.of(strPath));
        } catch (IOException e) {
            e.printStackTrace();
            return "Щось пішло не так: " + e.getMessage();
        }
    }
}
