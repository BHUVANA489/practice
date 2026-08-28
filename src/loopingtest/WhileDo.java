package loopingtest;

public class WhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 200;
		
		  //int i = 0 ; while(i<10) { System.out.println(i); i++; }
		 
//      do {
//    	  System.out.println(i);
//    	  i++;
//      }while(i<10);
		while(i>=25) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i--;
		}
	}

}
