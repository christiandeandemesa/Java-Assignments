import java.util.*;
public class CafeUtil {

    public String getStreakGoal(int numWeeks) {
        int drinks = 0;
        for(int i = 0; i <= numWeeks; i++) {
            drinks += i;
        }
        String sum = String.valueOf(drinks);
        return sum;
    }

    public String getOrderTotal(double[] prices) {
        double drinks = 0;
        for(int i = 0; i < prices.length; i++) {
            drinks += prices[i];
        }
        String total = String.valueOf(drinks);
        return total;
    }

    public String displayMenu(ArrayList<String> menuItems) {
        for(String item : menuItems) {
            System.out.println(menuItems.indexOf(item) + " " + item);
        }
        return "Hello"; // Why doesn't this show?
    }
    
    public String addCustomer(ArrayList<String> customers) {
        System.out.println(customers);
        return "Hello"; // Why doesn't this show?
    }
}