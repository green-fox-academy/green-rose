public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int daily = 6;

        // The semester is 17 weeks long
        int semester = 17;
        // Print how many hours is spent with coding in a semester by an attendee,

        int codingHours = daily*5*semester;
        System.out.println("hours is spent with coding in a semester by an attendee: "+codingHours);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float percentageWorkHours = (float) (30./52*100);
        System.out.println("It is "+String.format("%.02f", percentageWorkHours)+" percentage of the work hours.");
    }
}
