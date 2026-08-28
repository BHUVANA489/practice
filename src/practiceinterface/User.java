package practiceinterface;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Lenovo lenovo = new Lenovo();
  lenovo.copy();
  lenovo.paste();
  lenovo.camara();
  lenovo.keyboard();
   lenovo.security();  
  Laptop.audio();//static keyword used so directly call from interface 
  HP hp = new HP();
  hp.copy();
  hp.cut();
  hp.printing();
 
	
  Apple apple = new Apple();
  apple.copy();
  apple.cut();
  apple.paste();
  apple.keyboard();
  //until java7 
  
  // java 7 version varaku oka business document lo ,interface what to do anedhe chepali , how to do anedhi kadhu 
  // java 8 ultimate version . in interface in java8 how to do concept also mentioned becoz of new features . ex streamAPI, List etx...
	
	
	}
	
}
