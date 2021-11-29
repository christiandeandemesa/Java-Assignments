import java.util.*;
public class Exceptions {
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            // try will run if one of the above values can be cast as an integer.
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.printf("%d was successfully cast as an integer!\n", castedValue);
                // "48 was successfully cast as an integer!"
            }
            // catch will run if one of the above values can't be cast as an integer.
            // Assigns the ClassCastException error message to a variable.
            catch (ClassCastException e) {
                System.out.println(e);
                // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
            }
        }

    }
}