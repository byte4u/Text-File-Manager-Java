import java.io.File;
import java.util.Scanner;

/**
 * Text Reader
 *
 * @author Samadhi
 * @version 1
 * @date 2021/01/26
 */
public class TextReaderLesson1 {
                
    public static void main(String[] args) {
        String filePath = "c:\\";
        String fileName = "file.txt";
        File file = new File(filePath + fileName);

        try {
            Scanner scan = new Scanner(file);

            /*The hasNextLine() method will scan every file, and if the file 
	    is different from null it will return true. If the hasNextLine() 
	    method returns true we will use the nextLine () method to read the 
	    lines from the file.*/

            if (scan.hasNextLine()) {
                while (scan.hasNextLine()) {
                    System.out.println(scan.nextLine());
                }
            } else {
                System.out.println("There is nothing to read!");
            }

            scan.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
