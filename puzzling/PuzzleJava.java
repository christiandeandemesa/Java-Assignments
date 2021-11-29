import java.util.*;
public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randTen = new ArrayList<Integer>();
        // Variable that generates a random number.
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            // add() adds the number in the parentheses to the randTen ArrayList.
            // nextInt() gets the next random number from 0 - 19, and added 1 to change the range to 1 - 20.
            randTen.add(rand.nextInt(20) + 1);
        }
        return randTen;
    }

    public String getRandomLetter() {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // charAt() gets the character from the given index in the parentheses from the alphabet string.
        char randomChar = alphabet.charAt(rand.nextInt(26));
        // Returns and changes the data type to a String in one line.
        return String.valueOf(randomChar);
    }

    public String generatePassword() {
        // Creates an empty string.
        String password = "";
        for(int i = 0; i < 8; i++) {
            // Invokes the getRandomLetter method from above.
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            // Invokes the generatePassword method from above.
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

}