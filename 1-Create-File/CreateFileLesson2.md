# How to create a text file using java - Lesson 2
###### BYTE4U - IT Solutions

## Summary
- [What will you learn](#What-will-you-learn)
- [Prerequisites](#Prerequisites)
- [Source code](#source-code)
  - [This program creates a text file using the File class](#This-program-creates-a-text-file-using-the-File-class)
  
## What will you learn
- Scanner class

## Prerequisites

- Logic programming
  - Java Programming
  - Variables
  - Conditional structure
  - Try catch

# Note:
  In this lesson, we will enter the path manually. That way we can 
  choose where to save the text file.
  
# Program images

![File successfuly created](/1-Create-File/File-successfuly-created.png)
![File already exists](/1-Create-File/File-already-exists.png)

## Source code

### This program creates a text file using the File class

```java

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

```
