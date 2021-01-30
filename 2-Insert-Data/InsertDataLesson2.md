# How to insert data into text file using java - Lesson 2
###### BYTE4U - IT Solutions

## Summary
- [What will you learn](#What-will-you-learn)
- [Prerequisites](#Prerequisites)
- [Source code](#source-code)
  - [This program will insert data into an existing text file](#This-program-will-insert-data-into-an-existing-text-file.)
  
## What will you learn
- Insert n data with a Loop
- Append

## Prerequisites

- Have done the previous class 
  - (https://github.com/samadhi999/Text-File-Manager-Java/tree/main/1-Create-File)
  - (https://github.com/samadhi999/Text-File-Manager-Java/blob/main/2-Insert-Data/InsertDataLesson1.java)

# Note:
 The fileWriter class takes two parameters. The first parameter is of type 
 String relative to the file, and the second parameter is of type Boolean. 
 The second parameter is an append, that is, if this parameter is omitted 
 it is the same as false, then any new data that is inserted will overwrite 
 the data recorded in the file. If true, a new record will be added after the 
 last recorded record.

## Source code

### This program will insert data into an existing text file

```java

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


```
