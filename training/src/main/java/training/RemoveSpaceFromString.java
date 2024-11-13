package training;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String str,str2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name");
		str=input.nextLine();
		str2=str.replaceAll("\\s", "");///removing space "\\s" is removing all empty space in given string
		System.out.println(str2);

	}

}
