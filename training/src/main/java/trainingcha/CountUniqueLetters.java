package trainingcha;

import java.util.HashSet;

public class CountUniqueLetters{
    public static void main(String[] args) {
        String name = "thomass"; // Define the string
        int uniqueLetterCount = countUniqueLetters(name); // Call the counting method
        System.out.println("The number of unique letters in \"" + name + "\" is: " + uniqueLetterCount); // Print the result
    }

    // Method to count unique letters
    public static int countUniqueLetters(String str) {
        HashSet<Character> uniqueLetters = new HashSet<>(); // Use a Set to store unique letters

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at position i
            if (Character.isLetter(currentChar)) { // Check if it's a letter
                uniqueLetters.add(currentChar); // Add the letter to the Set
            }
        }
        return uniqueLetters.size(); // Return the number of unique letters
    }
}
