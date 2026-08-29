
public class MovezerosStart {

	public static void main(String[] args) {
		int arr[] = {1,3,0,0};
		int zero = arr.length-1;
		for(int i =arr.length-1; i>=0;i--) {
			if(arr[i]!=0) {
				arr[zero]=arr[i];
				zero--;
			}
		}
		while(zero>=0) {
			arr[zero]=0;
			zero--;
		}
		
	 for(int k : arr) {
	 System.out.print(k+" ");
	}

}
}

