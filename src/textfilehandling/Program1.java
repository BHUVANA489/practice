package textfilehandling;

import java.io.File;
import java.io.IOException;

public class Program1 {


	public static void main(String[] args) throws IOException {
		File file = new File("./practice");
       if(!file.exists())
    	 file.createNewFile();
	

	}

}
