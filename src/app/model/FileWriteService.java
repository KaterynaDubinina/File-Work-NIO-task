package app.model;

import utils.Constants;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {
    public static String createAndWriteToFile(String fileName, String content) {
        String strPath = Constants.PATH_IN + fileName;
        try {
            Path path = Files.createFile(Path.of(strPath));

            if (Files.exists(path)) {
                Files.delete(path);
            }

            writeToFile(path, content);

            return "Записано в: " + path;
        } catch (FileAlreadyExistsException e) {
            return "Файл вже існує!";
        } catch (IOException e) {
            return "Щось не так " + e.getMessage();
        }
    }

    private static void writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
