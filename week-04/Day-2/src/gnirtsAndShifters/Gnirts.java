package gnirtsAndShifters;

public class Gnirts implements CharSequence{
    public String gnirts;
    Gnirts (String gnirts){
        this.gnirts = gnirts;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
       return this.gnirts.charAt(this.gnirts.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
