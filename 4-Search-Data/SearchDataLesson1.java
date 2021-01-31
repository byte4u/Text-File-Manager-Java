import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;

/**
 * Search data
 *
 * @author Samadhi
 * @version 1
 * @date 2021/01/31
 */

public class SearchDataLesson1 {

    public static void search() {
        Scanner scan = new Scanner(System.in);

        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| Enter the name of the folder where the file is located    |");
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
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| Enter search:                                             |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.print(">>> ");
        String searchData = scan.next();
        System.out.println();

        int arraySize = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + fileName))) {
            
            String ln = bufferedReader.readLine();

            while (ln != null) {
                arraySize = arraySize + 1;
                ln = bufferedReader.readLine();
            }
	
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {

            String[] list = new String[arraySize];
            String line = br.readLine();
            for (int count = 0; count < arraySize; count++) {
                list[count] = line;
                line = br.readLine();

                if (line == null) {
                    break;
                }
            }
	         
            Boolean searchList = Arrays.toString(list).contains(searchData);
            
            if (searchList == true) {
                System.out.println();
		System.out.println("Found: " + searchData);
                
            } else {
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("| Data not found!                                           |");
                System.out.println("+-----------------------------------------------------------+");
            }

        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        search();
    }
}
