package arraysPractice;

public class DuplicatesArray {

	public static void main(String[] args) {
		
		
		        int[] arr = {6, 1, 3, 1, 6, 7, 7};

		        System.out.println("Duplicate elements are:");

		        for (int i = 0; i < arr.length; i++) {

		            boolean isDuplicate = false;

		            // Check if already printed
		            for(int k = 0; k < i; k++) {
		                if (arr[i] == arr[k]) {
		                    isDuplicate = true;
		                    break;
		                }
		            }

		            if (isDuplicate) {
		                continue;
		            }

		            int count = 0;

		            for (int j = 0; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                }
		            }

		            if (count > 1) {
		                System.out.println(arr[i]);
		            }
		        }
		    }
		}
	
