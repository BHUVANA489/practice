import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size");
      int size = sc.nextInt();
      int[] nums = new int[size];
      for(int i = 0 ;i<size;i++) {
    	  System.out.println("enter value index:"+i+" ");
    	  nums [i] = sc.nextInt();
      }
      for(int k : nums)
    	  System.out.print(k+" ");
     int sum = totalSum(nums);
     System.out.println("total sum: "+sum);
	}

	private static int totalSum(int[] nums) {
		int ans = 0;
		for(int i = 0;i<nums.length;i++) {
			ans+=nums[i];
		}
		return ans;
	}

}
