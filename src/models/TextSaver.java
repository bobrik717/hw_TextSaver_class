package models;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
    private Transformer transformer;
    private File file;

    public TextSaver(Transformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }

    public Transformer getTransformer() {
        return transformer;
    }

    public void setTransformer(Transformer transformer) {
        this.transformer = transformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void saveTextToFile(String text) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(transformer.transform(text));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
