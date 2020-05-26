public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String firstPart = quote.substring(0, 21);
        String secondPart = "always takes longer than";
        String lastPart = quote.substring(20);
        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        StringBuilder quoteBuild= new StringBuilder(firstPart+secondPart+lastPart);
        quote = quoteBuild.toString();
        System.out.println(quote);
    }
}
