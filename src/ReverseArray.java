
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //two pointer approach
		int [] nums = {1,2,3,4,5};
		int start = 0;
		int end = nums.length-1;
		while(start<end) {
			int temp = nums[start];
			nums[start]= nums[end];
			nums[end]= temp;
			start++;
			end--;
		}
		for(int k : nums)
			System.out.print(k+" ");
		
	}

}
