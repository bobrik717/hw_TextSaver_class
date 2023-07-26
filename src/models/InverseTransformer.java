package models;

public class InverseTransformer implements Transformer {
    public InverseTransformer() {
    }

    @Override
    public String transform(String text) {
        char[] cArr = text.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = cArr.length - 1; i >= 0; i--) {
            str.append(cArr[i]);
        }
        return str.toString();
    }
}
