
public class Counter {
    Integer value;
    Integer initValue;

    public Counter(){
        this(0);
    }

    public Counter(Integer value) {
        this.value=value;
        this.initValue=value;
    }

    public void add(Integer number) {
        this.value+=number;
    }

    public Integer get() {
       return this.value;
    }

    public void reset() {
        this.value=initValue;
    }

    public void add() {
        this.value++;
    }
}

