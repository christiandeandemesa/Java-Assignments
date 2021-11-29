import java.util.*;
public class TestPuzzle {
    public static void main(String[] args) {

        PuzzleJava puzzleTest = new PuzzleJava();

        System.out.println("----- Get Ten Rolls -----");
        System.out.println(puzzleTest.getTenRolls());
        // An array of 10 random numbers from 1 - 20.

        System.out.println("\n----- Get Random Letter -----");
        System.out.println(puzzleTest.getRandomLetter());
        // A random letter.

        System.out.println("\n----- Generate Password -----");
        System.out.println(puzzleTest.generatePassword());
        // A password that is composed of eight random letters.

        System.out.println("\n----- Generate New Password Set -----");
        System.out.println(puzzleTest.getNewPasswordSet(10));
        // An array of 10 passwords each composed of eight random letters.

    }
}