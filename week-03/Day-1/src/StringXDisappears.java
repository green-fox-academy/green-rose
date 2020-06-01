import java.util.Scanner;

public class StringXDisappears {
    public static void main(String[] args) {
        System.out.print("String: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(removeX(line));

    }
    public static String removeX(String string) {
        if (string.length() == 0) {
            return "";
        } else {
           if( string.charAt(0) =='x') {
               return removeX(string.substring(1));
           } else return string.charAt(0)+removeX(string.substring(1));

        }
    }
}
