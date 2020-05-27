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
        if (!file.exists() || !file.canRead()) return lineCount;
        Scanner anotherScanner=null;
        try {

            anotherScanner = new Scanner(file);
            while (anotherScanner.hasNextLine()){
                anotherScanner.nextLine();
                lineCount++;
            }

        } catch (IOException ex){

        }
        finally {
            anotherScanner.close();
            return lineCount;
        }
       
    }

}
