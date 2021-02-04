import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Delete data
 *
 * @author Samadhi
 * @version 1
 * @date 2021/02/02
 */

public class DeleteDataLesson1 {

    public static void delete() {
        Scanner scan = new Scanner(System.in);

        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| Enter the name of the folder where the file is located:   |");
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
        System.out.println("| Enter the position of the data you want to delete:        |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.print(">>> ");
        int deleteThisPosition = scan.nextInt();
        System.out.println();
        int arraySize = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + fileName))) {
            String ln = bufferedReader.readLine();

            while (ln != null) {
                arraySize = arraySize + 1;
                ln = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {

            String[] list = new String[arraySize];
            int count = 0;
            String line = br.readLine();
            while (count < arraySize) {
                list[count] = line;
                line = br.readLine();
                count = count + 1;
            }
            //------------------------------------------
            int elementsLeftDelete = deleteThisPosition - 0;
            int elementsRightDelete = (list.length) - (deleteThisPosition + 1);
            if (elementsLeftDelete == 0) {
                try (FileWriter fileWriter1 = new FileWriter(filePath + fileName)) {
                    for (int k = 0; k < elementsRightDelete; k++) {
                        String insertData = list[deleteThisPosition + 1 + k];
                        fileWriter1.write(insertData + "\r\n");
                    }
                    System.out.println("+-----------------------------------------------------------+");
                    System.out.println("| Data deleted successfully!                                |");
                    System.out.println("+-----------------------------------------------------------+");
                } catch (Exception e) {
                    System.out.println("An Errorr ocurred!");
                    e.getMessage();
                }
            } else if (elementsRightDelete == 0) {
                try (FileWriter fileWriter2 = new FileWriter(filePath + fileName)) {
                    for (int x = 0; x < elementsLeftDelete; x++) {
                        String insertData = list[x];
                        fileWriter2.write(insertData + "\r\n");
                    }
                    System.out.println("+-----------------------------------------------------------+");
                    System.out.println("| Data deleted successfully!                                |");
                    System.out.println("+-----------------------------------------------------------+");

                } catch (Exception e) {
                    System.out.println("An Errorr ocurred!");
                    e.getMessage();
                }
            } else {

                try (FileWriter fileWriter3 = new FileWriter(filePath + fileName)) {
                    for (int y = 0; y < elementsLeftDelete; y++) {
                        String insertData1 = list[y];
                        fileWriter3.write(insertData1 + "\r\n");
                        Boolean leftDone = y + 1 == elementsLeftDelete;
                        if (leftDone == true) {
                            for (int z = 0; z < elementsRightDelete; z++) {
								String insertData2 = list[deleteThisPosition + 1 + z];
                                fileWriter3.write(insertData2 + "\r\n");
                            }
                            break;
                        }
                    }
                    System.out.println("+-----------------------------------------------------------+");
                    System.out.println("| Data deleted successfully!                                |");
                    System.out.println("+-----------------------------------------------------------+");

                    fileWriter3.flush();
                } catch (Exception e) {
                    System.out.println("An Errorr ocurred!");
                    e.getMessage();
                }
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        delete();
    }
}