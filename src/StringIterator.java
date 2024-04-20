import java.util.Iterator;

public class StringIterator implements Iterator<Character> {

    private MyString word;
    private Character currentChar;

    public StringIterator(MyString word) {
        this.word = word;

        currentChar = word.firstChar();
    }

    @Override
    public boolean hasNext() {
        return currentChar >= word.firstChar() && currentChar <= word.lastChar();
    }

    @Override
    public Character next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the range");
        }
        return currentChar;
    }
}
