# How to insert data into text file using java - Lesson 1
###### BYTE4U - IT Solutions

## Summary
- [What will you learn](#What-will-you-learn)
- [Prerequisites](#Prerequisites)
- [Source code](#source-code)
  - [This program will insert data into an existing text file](#This-program-will-insert-data-into-an-existing-text-file.)
  
## What will you learn
- FileWriter class

## Prerequisites

- Have done the previous class (https://github.com/samadhi999/Text-File-Manager-Java/tree/main/1-Create-File)

## Source code

### This program will insert data into an existing text file

```java
import java.io.FileWriter;
import java.io.IOException;

/**
 * Insert data
 *
 * @author Samadhi
 * @version 1
 * @date 2021/01/25
 */
public class InsertData { 

    public static void main(String[] args) {
        try {
            String filePath = "c:\\";
            String fileName = "file.txt";
            FileWriter fw = new FileWriter(filePath + fileName);
            fw.write("Hello world!");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```
