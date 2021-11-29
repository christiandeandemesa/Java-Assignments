public class CafeJava {
    public static void main(String[] args) {
        
        // Lines of text that will appear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffee = 1.5;
        double latte = 2.5;
        double cappuccino = 4.5;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + customer1);
        // "Welcome to Cafe Java, Cindhuri"

        System.out.println(customer1 + pendingMessage);
        // "Cindhuri, your order will be ready shortly"

        if(isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage);
            // "Noah, your order is ready"
            System.out.println(displayTotalMessage + cappuccino);
            // "Your total is $4.5"
        }

        System.out.println(displayTotalMessage + latte * 2);
        // "Your total is $5"
        if(isReadyOrder2 != true) {
            System.out.println(customer2 + pendingMessage);
            // "Sam, your order will be ready shortly"
        }

        System.out.println(displayTotalMessage + (latte - dripCoffee));
        // "Your total is $1"

    }
}