import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();
    
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        int weeks = 10;
        System.out.printf("Purchases needed by week %d: %s \n\n", weeks, appTest.getStreakGoal(weeks));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);
        
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            customers.add(userName);
            System.out.printf("Hello, %s! There is/are %d people ahead of you.\n", userName, customers.indexOf(userName));
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
