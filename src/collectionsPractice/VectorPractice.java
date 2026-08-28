package collectionsPractice;
import java.util.*;
//import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();//creation of list
		v.add("bhuvana");
		v.add("bhu");
		v.add(0,"wow");//hero 0 is index
		//hero 0 is index
		
		System.out.println(v);
		Vector v1 = new Vector();
		v1.add("ramesh");
		v1.add("suresh");
		
//		for(int i=0;i<v1.size();i++) {
//			v.add(v1.get(i));
//	
//		}  or
		v.addAll(v1);
		//v.addAll(0,v1);
		System.out.println(v);
		v.set(2, "ice");//value update
		System.out.println(v);
		System.out.println(v.get(2));
		Object[] arr =v.toArray();
		System.out.println(Arrays.toString(arr));
		//System.out.println(v.get(4));
		
		//System.out.println(v);
//		v.remove(0);
//		System.out.println(v);
//	v.remove("bhu");
//	System.out.println(v);
//        v.removeAll(v1);
//        System.out.println(v);
		
//		v.clear();
//		System.out.println(v);
	
		//System.out.println(v.contains("wow"));
		
//		Vector v2 = new Vector();
//		v2.add("bhu");
//		v2.add("wow");
//		System.out.println(v.containsAll(v2));
		//System.out.println("size:"+ v.size());
		//System.out.println("capacity:"+ v.capacity());
	Object[] array = new Object[] {1,5,8,9,10};
	Vector v3 = new Vector(Arrays.asList(array));
 System.out.println(v3);
 System.out.println(v3.size());
 System.out.println(v3.capacity());
	}

}
