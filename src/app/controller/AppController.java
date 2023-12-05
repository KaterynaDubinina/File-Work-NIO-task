package app.controller;

import app.entity.Content;
import app.entity.FileName;
import app.model.FileReadService;
import app.model.FileWriteService;
import app.view.AppView;

public class AppController {

    private final AppView view = new AppView();

    public void getWrite() {
        String dataContent = view.getContent();
        Content content = getContent(dataContent);
        String dataFileName = view.getFileName();
        FileName fileName = getFileName(dataFileName);
        FileWriteService service = new FileWriteService();
        String output = service.createAndWriteToFile(fileName.getFileName(), content.getContent());;
        view.getOutput(output);
    }

    public void getRead() {
        String dataFileName = view.getFileName();
        FileName fileName = getFileName(dataFileName);
        String output;
        FileReadService service = new FileReadService();
        String result = service.readFromFile(fileName.getFileName());
        output = "Ваш текст: " + result;
        view.getOutput(output);
    }

    private FileName getFileName (String dataFileName) {
        return new FileName(dataFileName);
    }

    private Content getContent (String content) {
        return new Content (content);
    }
}
