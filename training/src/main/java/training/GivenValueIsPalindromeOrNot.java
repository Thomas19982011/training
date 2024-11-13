package training;

import java.util.Scanner;

public class GivenValueIsPalindromeOrNot {

	public static void main(String[] args) {
	String Original,Reverse="";
	int Length;
	Scanner Input=new Scanner(System.in);
	System.out.println("ENTER THE VALUE");
	Original=Input.nextLine();
	Length=Original.length();///here we taking the input value of length by using length method
	for(int i=Length-1;i>=0;i--) {
		Reverse=Reverse+Original.charAt(i);//here convert the value into char then reversethe value
	}
	System.out.println("Reverse the number"+Reverse);
	if(Original.contains(Reverse)) {//here we are checking after reverse the original value and revserse value is same or not
		System.out.println("Its is a palindrome number");
		
	}else
		System.out.println("It is not a palindrome");
	
	}

}
