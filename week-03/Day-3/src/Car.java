public class Car {
    public int getGasAmount() {
        return gasAmount;
    }

    public int getCapacity() {
        return capacity;
    }

    private int gasAmount;

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;

    public Car (){
        this.gasAmount=0;
        this.capacity=100;
    }
}
