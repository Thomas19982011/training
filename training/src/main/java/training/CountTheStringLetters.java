package training;

import java.util.HashSet;
import java.util.Scanner;

public class CountTheStringLetters {

	public static void main(String[] args) {
		String name;
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		int ToatalCount=UniqueCount(name);///we can create method for UniqueCount
		System.out.println(ToatalCount);
	}
	public static int UniqueCount(String name) {
		HashSet<Character>StoredLetters=new HashSet<>();///here we storing the letters HashSet is not allowing repeating values

		for(int i=0;i<name.length();i++) {///for loop taking one by one letters)
			char Letters=name.charAt(i);///here letters is store the letter
			if(Character.isLetter(Letters)) {///this condition is checking the letters is letters or number
				StoredLetters.add(Letters);//here adding the char letter into hashset
			}
		}
		return StoredLetters.size();//return the size of HashSet
	}
}