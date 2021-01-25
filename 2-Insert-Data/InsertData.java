import java.io.FileWriter;
import java.io.IOException;

/**
 * Insert data
 *
 * @author Samadhi
 * @version 1
 * @date 2021/01/25
 */

public class InsertData{
	public static void main(String[] args){
		try{
		String filePath = "c:\\";
		String fileName = "file.txt";
		FileWriter fw = new FileWriter(filePath + fileName);
		fw.write("Hello world!");
		fw.close();
		}catch(IOException e){
		e.printStackTrace();
		}
	}
}