package gnirtsAndShifters;

public class Shifter implements CharSequence{
    public String string;
    public int shiftFor;

    Shifter(String string, int shiftFor){
        this.shiftFor=shiftFor;
        this.string=string;
    }
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(this.shiftFor+index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
