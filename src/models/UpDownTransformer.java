package models;

public class UpDownTransformer implements Transformer {
    @Override
    public String transform(String text) {
        char[] cArr = text.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cArr.length; i++) {
            if(i % 2 == 0) {
                str.append(String.valueOf(cArr[i]).toUpperCase());
            } else {
                str.append(String.valueOf(cArr[i]).toLowerCase());
            }
        }
        return str.toString();
    }
}
