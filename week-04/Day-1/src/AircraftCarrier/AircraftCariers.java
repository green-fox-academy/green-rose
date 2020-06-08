package AircraftCarrier;

public class AircraftCariers {
    public static void main(String[] args){
        Carrier blackCarrier = new Carrier(20, 5000);
        Carrier whiteCarrier = new Carrier(20, 20);
        blackCarrier.add(new F16());
        blackCarrier.add(new F16());
        blackCarrier.add(new F35());
        blackCarrier.add(new F35());
        blackCarrier.add(new F35());
        try {
            blackCarrier.fill();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(blackCarrier.getStatus());
        blackCarrier.fight(whiteCarrier);
        System.out.println(whiteCarrier.getStatus());
    }
}
