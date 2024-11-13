package trainingcha;

import java.util.LinkedHashSet;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		String input = "Automaaaaaas";
		  LinkedHashSet<Character> set = new LinkedHashSet<>();
		  
	        for (char c : input.toCharArray()) {
	            set.add(Character.toLowerCase(c)); 
	        }
	        StringBuilder sb = new StringBuilder();
	        for (char c : set) {
	            sb.append(c);
	        }
	        System.out.println(sb.toString());

	}

}
