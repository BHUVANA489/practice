package javapractice;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks: ");
	        int marks = sc.nextInt();

	        // Checking invalid marks
	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid Marks");
	        }

	        // Else-if ladder
	        else if (marks >= 90) {
	            System.out.println("Grade: A");

	            // Nested if
	            if (marks >= 95) {
	                System.out.println("Excellent Performance!");
	            } else {
	                System.out.println("Very Good!");
	            }
	        }

	        else if (marks >= 75) {
	            System.out.println("Grade: B");

	            // Nested if
	            if (marks >= 80) {
	                System.out.println("Good Performance!");
	            } else {
	                System.out.println("Well Done!");
	            }
	        }

	        else if (marks >= 60) {
	            System.out.println("Grade: C");

	            // Nested if
	            if (marks >= 65) {
	                System.out.println("Good!");
	            } else {
	                System.out.println("Keep Improving!");
	            }
	        }

	        else if (marks >= 40) {
	            System.out.println("Grade: D");

	            // Nested if
	            if (marks >= 50) {
	                System.out.println("You Passed!");
	            } else {
	                System.out.println("Pass, but Need Improvement!");
	            }
	        }

	        else {
	            System.out.println("Grade: F");

	            // Nested if
	            if (marks < 20) {
	                System.out.println("Need Significant Improvement!");
	            } else {
	                System.out.println("Need Improvement!");
	            }
	        }

	        sc.close();
	}

}
