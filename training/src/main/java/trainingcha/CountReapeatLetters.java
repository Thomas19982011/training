package trainingcha;

import java.util.HashMap;
import java.util.Map;

public class CountReapeatLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Sahayaraj";
		 input = input.toLowerCase();

         // Create a map to store character frequencies
Map<Character, Integer> letterCount = new HashMap<>();

           // Count the occurrences of each character
for (char c : input.toCharArray()) {
letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
}

                // Print the repeated letters
System.out.println("Repeated letters:");
for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
if (entry.getValue() > 1) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
	}


