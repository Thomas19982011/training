package training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRepeatLetters {

	public static void main(String[] args) {
		String name;
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		name=name.toLowerCase();
		Map<Character,Integer> StoredLetters=new HashMap<>();
		for(char c:name.toCharArray()) {
			StoredLetters.put(c,StoredLetters.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer>entry:StoredLetters.entrySet()){
				if(entry.getValue()>1) {
					System.out.println(entry.getKey() +" "+entry.getValue());
				}
			
		}

	}

}
