# How to delete data from a text file using java - Lesson 1
###### BYTE4U - IT Solutions

## Summary
- [What will you learn](#What-will-you-learn)
- [Prerequisites](#Prerequisites)
- [Source code](#source-code)
  - [This program will delete data from a text file.](#This-program-will-delete-data-from-a-text-file.)
  
## What will you learn
- Delete data

## Prerequisites

- Have done the previous class 
  - (https://github.com/samadhi999/Text-File-Manager-Java/tree/main/1-Create-File)
  - (https://github.com/samadhi999/Text-File-Manager-Java/tree/main/2-Insert-Data)
  - (https://github.com/samadhi999/Text-File-Manager-Java/blob/main/3-Text-Reader)

## Source code

### This program will delete data from a text file

```java
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
            int leftArraySize = deleteThisPosition - 0;
            int rightArraySize = (list.length) - (deleteThisPosition + 1);
            //Left array
            String[] leftArray = new String[leftArraySize];
            for (int i = 0; i < leftArraySize; i++) {
                leftArray[i] = list[i];
            }
            //Right array
            String[] rightArray = new String[rightArraySize];
            for (int j = 0; j < rightArraySize; j++) {
                rightArray[j] = list[deleteThisPosition + 1 + j];
            }
            if (leftArraySize == 0) {
                try (FileWriter fileWriter1 = new FileWriter(filePath + fileName)) {
                    for (int k = 0; k < rightArraySize; k++) {
                        String insertData = rightArray[k];
                        fileWriter1.write(insertData + "\r\n");
                    }
                    System.out.println("+-----------------------------------------------------------+");
                    System.out.println("| Data deleted successfully!                                |");
                    System.out.println("+-----------------------------------------------------------+");
                } catch (Exception e) {
                    System.out.println("An Errorr ocurred!");
                    e.getMessage();
                }
            } else if (rightArraySize == 0) {
                try (FileWriter fileWriter2 = new FileWriter(filePath + fileName)) {
                    for (int x = 0; x < leftArraySize; x++) {
                        String insertData = leftArray[x];
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
                    for (int y = 0; y < leftArraySize; y++) {
                        String insertData1 = leftArray[y];
                        fileWriter3.write(insertData1 + "\r\n");
                        Boolean leftDone = y + 1 == leftArraySize;
                        if (leftDone == true) {
                            for (int z = 0; z < rightArraySize; z++) {
                                String insertData2 = rightArray[z];
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

```
