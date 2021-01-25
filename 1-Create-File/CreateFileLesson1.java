import java.io.File;
import java.io.IOException;

/**
 * Create new file
 *
 * @author Samadhi
 * @version 1
 * @date 2021/01/22
 */

public class CreateFileLesson1{
	public static void main(String[] args){
	String filePath = "c:\\";
	/*If you want to create a file other than a text file, just change the extension:
	 .txt, .xls, .html, etc.*/
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
