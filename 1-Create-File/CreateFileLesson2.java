import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Create new file
 *
 * @author Samadhi
 * @version 2
 * @date 2021/01/28
 */

public class CreateFileLesson2 {

    public static void createFile() {
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
        File file = new File(filePath + fileName);
        try {

            if (file.createNewFile()) {
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("| File successfully created!                                |");
                System.out.println("+-----------------------------------------------------------+");
            } else {
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("| File already exists!                                      |");
                System.out.println("+-----------------------------------------------------------+");
            }
        } catch (IOException e) {
            System.out.println("+-----------------------------------------------------------+");
            System.out.println("| An error has occurred!                                    |");
            System.out.println("+-----------------------------------------------------------+");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createFile();
    }

}
