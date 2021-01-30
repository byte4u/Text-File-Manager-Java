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
