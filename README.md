# How to create text files in java - Lesson 1
###### BYTE4U - IT Solutions

## Summary
- [What will you learn](#What-will-you-learn)
- [Prerequisites](#Prerequisites)
- [Source code](#source-code)
  - [This program creates a text file using the File class](#This-program-creates-a-text-file-using-the-File-class)
  
## What will you learn
- File class, IOException

## Prerequisites

- Logic programming
  - Variables
  - Conditional structure
  - Try catch

## Source code

### This program creates a text file using the File class

```java
import java.io.File;
import java.io.IOException;

/**
 * Create new file
 *
 * @author Samadhi
 * @version 1
 * @date 2021/01/22
 */

public class CreateFile{
	public static void main(String[] args){
	String filePath = "c:\\";
	//The file can have any extension: .txt, .xls, .html, etc.
	String fileName = "file.txt";
		try{
		File file = new File(filePath + fileName);
			if(file.createNewFile()){
				System.out.println("File successfully created!");
			}else{
				System.out.println("File already exists!");
			}
		}catch(IOException e){
		System.out.println("An error has occurred!");
		e.printStackTrace();
		}
	}
}
```
