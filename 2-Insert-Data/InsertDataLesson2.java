
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Insert data
 *
 * @author Samadhi
 * @version 2
 * @date 2021/01/29
 */
public class InsertDataLesson2 {

    public static void insertData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| Enter the path where you want to save the file:           |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.print(">>> ");
        String filePath = scan.next();
        System.out.println();
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| Enter the name of the file you want to create:            |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.print(">>> ");
        String fileName = scan.next();
        System.out.println();

        try {

            /*
	    The second parameter of the Boolean type is an append. 
	    When the value is true, a new record is inserted at the 
	    end of the text.
             */

            FileWriter fileWriter = new FileWriter(filePath + fileName, true);

            System.out.println("+-----------------------------------------------------------+");
            System.out.println("| Enter how many elements you want to insert:               |");
            System.out.println("+-----------------------------------------------------------+");

            System.out.println();
            System.out.print(">>> ");
            int arraySize = scan.nextInt();
            System.out.println();

            for (int count = 1; count <= arraySize; count++) {

                System.out.println("+-----------------------------------------------------------+");
                System.out.println("| Insert the " + count + "º" + " dado:                                       |");
                System.out.println("+-----------------------------------------------------------+");
                System.out.println();
                System.out.print(">>> ");
                String insertData = scan.next();
                System.out.println();
                fileWriter.write(insertData + "\r\n");

            }
            System.out.println("+-----------------------------------------------------------+");
            System.out.println("| Records inserted successfully!                            |");
            System.out.println("+-----------------------------------------------------------+");

            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error ocurred!");
        }
    }

    public static void main(String[] args) {
        insertData();
    }
}
