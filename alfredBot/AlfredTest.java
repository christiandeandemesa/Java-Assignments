public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Christian Demesa");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing."
        );

        String testGreetingWithDayPeriod = alfredBot.guestGreetingWithDayPeriod("Christian Demesa", "morning");
        String testGreetingWithDayPeriodWrong = alfredBot.guestGreetingWithDayPeriod("Christian Demesa", "dusk");

        String testGreetingWithoutDayPeriod = alfredBot.guestGreetingWithoutDayPeriod("Christian Demesa");

        String testQuestion = alfredBot.snarkyRemark("Hello?");
        String testExclaim = alfredBot.snarkyRemark("Hello!");
        String testPeriod = alfredBot.snarkyRemark("Hello.");
        String testNoPunctuation = alfredBot.snarkyRemark("Hello");
        
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(testGreetingWithDayPeriod);
        System.out.println(testGreetingWithDayPeriodWrong);
        // System.out.println(testGreetingWithoutDayPeriod);
        System.out.println(testQuestion);
        System.out.println(testExclaim);
        System.out.println(testPeriod);
        System.out.println(testNoPunctuation);
    }
}
