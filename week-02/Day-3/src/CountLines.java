import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        String fileName = "../../src/ZZeenn.txt";
        System.out.println(countTheLines(fileName));
    }

    private static int countTheLines (String filename){
        File file = new File(filename);
        Integer lineCount = 0;
        if (file.exists()==false || file.canRead()==false) return 0;
        try {

            Scanner anotherScanner = new Scanner(file);
            while (anotherScanner.hasNextLine()){
                System.out.println(anotherScanner.nextLine());
                lineCount++;
            }
            anotherScanner.close();

        } catch (IOException ex){
            return 0;
        }
        return lineCount;
    }

}
