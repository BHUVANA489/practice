package javapractice;

public class Test {
   int i;
   int j;
	public Test() {
		// TODO Auto-generated constructor stub
		i = 10;
		j = 20;
	}
	public Test(int i, int j) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* Test t1 = new Test();//object creation 
     Test t2 = new Test(10);
     Test t3 = new Test(20);
     System.out.println(t1.hashCode());
    // System.out.println(t2.hashCode());
     //System.out.println(t3.hashCode());*/
		Test t1 = new Test();
		Test t2 = new Test(30,40);
		Test t3 = new Test(30,40);
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		System.out.println(t1 == t2);
		System.out.println(t2 == t3);
	}
	public int add() {
		return i+j;
	}

}
