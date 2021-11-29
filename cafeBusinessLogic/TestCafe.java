import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();
    
        /* ============ App Test Cases ============= */
    
        // /n creates a new line.
        System.out.println("\n----- Streak Goal Test -----");
        int weeks = 10;
        // Single-line version of string interpolation where %d is for integers, and %s is for strings.
        System.out.printf("Purchases needed by week %d: %s \n\n", weeks, appTest.getStreakGoal(weeks));
        // "Purchases needed by week 10: 55"
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        // "Order total: 13.5"
        
        System.out.println("----- Display Menu Test-----");
        // List is the Object type for Arrays.asList which makes the array into a list.
        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        // Adds all the elements from loadMenu into menu.
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);
        // "0 drip coffee"   "1 cappucino"   "2 latte"   "3 mocha"
        
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter your name:");
            // Allows the user to type a name in the terminal.
            String userName = System.console().readLine();
            // Adds what the user typed to the customers array.
            customers.add(userName);
            System.out.printf("Hello, %s! There is/are %d people ahead of you.\n", userName, customers.indexOf(userName));
            appTest.addCustomer(customers);
            System.out.println("\n");
            // What prints in the terminal varies by what the user typed.
        }
        
    }
}
