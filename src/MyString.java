import java.util.Iterator;

public class MyString implements Iterable<Character> {

    private String word;
    private int stringLength;

    public MyString(String word) {
        this.word = word;

        stringLength = word.length();
    }

    public Character firstChar() {
        return word.charAt(0);
    }

    public Character lastChar() {
        return word.charAt(stringLength);
    }

    @Override
    public Iterator<Character> iterator() {
        return null;
    }
}
