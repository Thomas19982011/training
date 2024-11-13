package training;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		String name;
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		LinkedHashSet<Character> StoredLetters=new LinkedHashSet<>();
		for(char c:name.toCharArray()) {
			StoredLetters.add(Character.toLowerCase(c));
			
		}
		StringBuilder sb=new StringBuilder();
		for(char c:StoredLetters) {
			sb.append(c);
		}
		System.out.println(sb.toString());
		
		

	}

	
}
