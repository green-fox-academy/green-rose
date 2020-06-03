import javax.security.auth.login.CredentialNotFoundException;

public class Station {
    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    private int gasAmount;

    public Station(int gasAmount){
        this.gasAmount = gasAmount;
    }
    public void reFill(Car car){
        if (this.getGasAmount()>=car.getCapacity()-car.getGasAmount()){
            this.setGasAmount(this.getGasAmount()-car.getCapacity()+car.getGasAmount());
            car.setGasAmount(car.getCapacity());
        } else {
            car.setGasAmount(car.getGasAmount()+this.getGasAmount());
            this.setGasAmount(0);
        }

    }


}
