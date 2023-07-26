package models;

public class TextTransformer implements Transformer{
    public TextTransformer() {
    }

    @Override
    public String transform(String text) {
        return text.toUpperCase();
    }
}
