import java.util.Scanner;

public class StringStars {
    public static void main(String[] args) {
        System.out.print("String: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(addStarr(line));

    }
    public static String addStarr(String string) {
        if (string.length() == 1) {
            return string;
        } else {
            return string.charAt(0)+"*"+addStarr(string.substring(1));

        }
    }
}
