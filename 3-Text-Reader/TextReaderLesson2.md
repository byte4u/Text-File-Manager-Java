# How to read a text file using java - Lesson 2
###### BYTE4U - IT Solutions

## Summary
- [What will you learn](#What-will-you-learn)
- [Prerequisites](#Prerequisites)
- [Source code](#source-code)
  - [This program will read a text file.](#This-program-will-read-a-text-file.)
  
## What will you learn
- FileReader
- BufferedReader
- Try with resources

## Prerequisites

- Have done the previous class 
  - (https://github.com/samadhi999/Text-File-Manager-Java/tree/main/1-Create-File)
  - (https://github.com/samadhi999/Text-File-Manager-Java/tree/main/2-Insert-Data)
  - (https://github.com/samadhi999/Text-File-Manager-Java/blob/main/3-Text-Reader/TextReaderLesson1.md)

# Note:
 In this version we will create an object of the FileReader class that will 
 read the text file, and we will place it in a BufferedReader constructor, 
 thus, the object of the BufferedReader class will better manage the reading 
 of text. In addition, we will use Try with resources. Try with resources will 
 move any open resource in the try block, that is, we will not use the close() 
 method, Try with resources is in charge of closing this resource.
 
## Source code

### This program will read a text file

```java
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Text Reader
 *
 * @author Samadhi
 * @version 2
 * @date 2021/01/30
 */

public class TextReaderLesson2 {
   
    public static void textReader(){
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

            try(BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))){
                String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
            }catch(IOException e){

        }      
     
    }
   
    public static void main(String[] args) {
            textReader();
    }
}

```
