import java.util.Scanner;

public class StringsXtoY {
    public static void main(String[] args) {
        System.out.print("String: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(swapString(line));

    }
    public static String swapString(String string) {
        if (string.length() == 0) {
            return "";
        } else {
           if( string.charAt(0) =='x') {
               return 'y'+swapString(string.substring(1));
           } else return string.charAt(0)+swapString(string.substring(1));

        }
    }
}
