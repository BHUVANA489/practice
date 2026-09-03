package dailypractice;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String given = "MADAM";
    String reverse = "";
    char ch = ' ';
    for(int i = 0;i<given.length();i++) {
    	ch=given.charAt(i);
    	reverse = ch+reverse;
    }
    System.out.println(reverse);
    if(given.equals(reverse)) {
    	System.out.println("palindrome");
    }else {
    	System.out.println("not a palindrome");
    }
    
	}

}
