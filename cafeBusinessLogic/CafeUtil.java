// Imports everything.
import java.util.*;
public class CafeUtil {

    public String getStreakGoal(int numWeeks) {
        int drinks = 0;
        // For loop increments drink by i.
        for(int i = 0; i <= numWeeks; i++) {
            drinks += i;
        }
        // Changes the drinks data type from an integer to a string.
        String sum = String.valueOf(drinks);
        return sum;
    }

    // double is a float number.
    public String getOrderTotal(double[] prices) {
        double drinks = 0;
        // For loop increments drinks by the number in each index of the prices array.
        for(int i = 0; i < prices.length; i++) {
            drinks += prices[i];
        }
        String total = String.valueOf(drinks);
        return total;
    }

    public String displayMenu(ArrayList<String> menuItems) {
        // Enhanced for loop to print the index number and the item at that index.
        for(String item : menuItems) {
            System.out.println(menuItems.indexOf(item) + " " + item);
        }
        // Needed a return statement, but "Hello" doesn't show for some reason?
        return "Hello";
    }
    
    public String addCustomer(ArrayList<String> customers) {
        System.out.println(customers);
        return "Hello";
    }

}