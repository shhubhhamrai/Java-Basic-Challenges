package Challenges;

public class Challenge04 {
    public static void main(String[] args) {
        // Define the string
        String str = "Welcome to Clarivate!";

        // Calculate and print length of string
        int length = calculateStringLength(str);
        System.out.println("Length of the string: " + length);
    }

    // Method to calculate length of a string
    public static int calculateStringLength(String str) {
        int length =0;
        for (char c : str.toCharArray()){
            length++;
        }
        return length;
    }
}
