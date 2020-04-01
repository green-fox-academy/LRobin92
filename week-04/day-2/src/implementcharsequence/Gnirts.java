package implementcharsequence;

public class Gnirts implements CharSequence {
    String word;
    public Gnirts(String word){
        this.word = word;
    }
    @Override
    public int length() {

        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(word.length()-1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.subSequence(start, end);
    }
}
