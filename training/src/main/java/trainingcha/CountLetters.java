package trainingcha;

public class CountLetters {

	public static void main(String[] args) {
		String name="Thomass";
		int letterCount=CountLetters(name);
        System.out.println("The number of letters in \"" + name + "\" is: " + letterCount); // Print the result


	}

	public static int CountLetters(String name) {
		 int count = 0; // Initialize a counter to 0

	        // Loop through each character in the string
	        for (int i = 0; i < name.length(); i++) {
	            // Check if the character is a letter
	            if (Character.isLetter(name.charAt(i))) {
	                count++; // Increment the counter if it is a letter
	            }
	        }
	        return count; // Return the total count
	    
	}

}
