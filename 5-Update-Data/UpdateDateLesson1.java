import java.util.Scanner;
import java.util.Arrays;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Update data
 *
 * @author Samadhi
 * @version 1
 * @date 2021/02/01
 */
public class UpdateDataLesson1 {

    public static void update() {
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
        System.out.println("| Enter the new data:                                       |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.print(">>> ");
        String update = scan.next();
        System.out.println();
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| Enter the position of the array:                          |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.print(">>> ");
        int arrayPosition = scan.nextInt();
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
            for (int i = 0; i < arraySize; i++) {
                list[i] = line;
                line = br.readLine();

                if (line == null) {
                    break;
                }
            }
            list[arrayPosition] = update;
            Arrays.toString(list);

            try (FileWriter fileWriter = new FileWriter(filePath + fileName)) {
                for (int j = 0; j < arraySize; j++) {
                    String insertData = list[j];
                    fileWriter.write(insertData + "\r\n");
                }
                System.out.println("+-----------------------------------------------------------+");
                System.out.println("| Successefully updated to the file!                        |");
                System.out.println("+-----------------------------------------------------------+");
                fileWriter.flush();

            } catch (IOException e) {
                System.out.println("An error ocurred!");
                e.getMessage();
            }

        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        update();
    }
}
