package textfilehandling;

import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// this is 1st way to write in text file using FileOutputStream method or way
//     File file = new File("./Writing.txt");
//     if(!file.exists())
//    	 file.createNewFile();
//     String s = "i am bhuvana";
//     FileOutputStream fos = new FileOutputStream(file);
//     for(char ch:s.toCharArray()) {
//    	 fos.write((int)ch);
//     }
     

//     fos.write(72);
//     fos.write(75);
//     fos.write(104);
//     fos.write(104);
//     fos.flush();
//    	//fos.close();
     //now 2nd one FileWriter method
//		File file = new File("./Writing.txt");
//	     if(!file.exists())
//	    	 file.createNewFile();
//     String s = "i am bhuvaneswari";
//     FileWriter fw = new FileWriter(file);
//     fw.write(s.toCharArray());
//     
//     fw.flush();
//     fw.close();
     //now buffered writer method
		File file = new File("./Writing.txt");
	     if(!file.exists())
	    	 file.createNewFile();
	     String s = "hello";
	     BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	     bw.write(s);
	     bw.flush();
	     bw.close();
	}

}
