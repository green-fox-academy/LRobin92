package implementcharsequence;

public class Shifter implements CharSequence{
    String word;
    int startingIndex;
    public Shifter(String word, int startingIndex){
        this.word = word;
        this.startingIndex = startingIndex;
    }
    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(startingIndex);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.subSequence(start, end);
    }
}
