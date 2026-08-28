package textfilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProgramFile {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("./practice.txt");
//		if(!file.exists())
//			file.createNewFile();
		try {
			int arr[] = {1,2};
			System.out.println(arr[1]/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//autoclosable
	
//		FileReader fr = null;
//		BufferedReader br = null;
//		try {
		FileReader	fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
	
		String Line = new String();
		
		while((Line = br.readLine()) !=null) {
			System.out.println(Line);
		}
        fr.close();
        br.close();	

    }
}
