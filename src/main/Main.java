package main;

import models.TextSaver;
import models.UpDownTransformer;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        TextSaver textSaver = new TextSaver(new UpDownTransformer(), new File("file_with_text.txt"));
        textSaver.saveTextToFile("Hello world");
    }
}