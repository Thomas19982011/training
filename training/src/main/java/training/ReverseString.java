package training;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner input=new Scanner(System.in);
		System.out.println("Rnter Reverse string");
		str=input.nextLine();///get the string from console window
		StringBuilder str1=new StringBuilder();
		str1.append(str);//this step is given string is to splitted in each chars by ussing append
		str1=str1.reverse();///this step is after append we going to write a string in reverse
		System.out.println(str1);
		

	}

}
