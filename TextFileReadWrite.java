package textfilehandling;
import java.io.BufferedReader;
// these all method for read the text file using FileInputStream way
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./practice.txt");
		if(!file.exists())
			file.createNewFile();
//FileInputStream fis = new FileInputStream(file);
//        int asciiCode;
//        while((asciiCode = fis.read())!=-1) {
//        System.out.print((char)asciiCode);
//	}
//     fis.close();
		
		//now using 2 and way scanner way to read the text file
//		Scanner scanner = new Scanner(file);
//	while(scanner.hasNext()) {
//		System.out.println(scanner.nextLine());
//	}
//		scanner.close();
		//this is 3rd way to read the txt using fileReader method 
		//FileReader fr = new FileReader(file);
//		int asciiCode;
//        while((asciiCode = fr.read())!=-1) {
//      System.out.print((char)asciiCode);
//	}
//		System.out.println();
//		//System.out.println(text);
//		fr.close();
		
		//this is 4th way to read the txt using BufferReader method
		       FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
//				int asciiCode;
//		        while((asciiCode = br.read())!=-1) {
//		      System.out.print((char)asciiCode);
//
//		        }			
//		        System.out.println();
				String Line = new String();
				while((Line = br.readLine()) !=null) {
					System.out.println(Line);
				}
		        fr.close();
		        br.close();				
   }

}

