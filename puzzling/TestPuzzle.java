import java.util.ArrayList;
import java.util.*;

public class TestPuzzle {
    public static void main(String[] args) {

        PuzzleJava puzzleTest = new PuzzleJava();

        System.out.println("----- Get Ten Rolls -----");
        System.out.println(puzzleTest.getTenRolls());

        System.out.println("\n----- Get Random Letter -----");
        System.out.println(puzzleTest.getRandomLetter());

        System.out.println("\n----- Generate Password -----");
        System.out.println(puzzleTest.generatePassword());

        System.out.println("\n----- Generate New Password Set -----");
        System.out.println(puzzleTest.getNewPasswordSet(10));

    }
}