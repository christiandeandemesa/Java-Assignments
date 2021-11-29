public class AlfredTest {
    public static void main(String[] args) {

        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Christian Demesa");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing.");

        String testGreetingWithDayPeriod = alfredBot.guestGreetingWithDayPeriod("Christian Demesa", "morning");
        String testGreetingWithDayPeriodWrong = alfredBot.guestGreetingWithDayPeriod("Christian Demesa", "dusk");

        // String testGreetingWithoutDayPeriod = alfredBot.guestGreetingWithoutDayPeriod("Christian Demesa");

        String testQuestion = alfredBot.snarkyRemark("Hello?");
        String testExclaim = alfredBot.snarkyRemark("Hello!");
        String testPeriod = alfredBot.snarkyRemark("Hello.");
        String testNoPunctuation = alfredBot.snarkyRemark("Hello");
        
        System.out.println(testGreeting);
        // "Hello, lovely to see you. How are you?"

        System.out.println(testGuestGreeting);
        // "Hello, Christian Demesa. Lovely to see you."

        System.out.println(testDateAnnouncement);
        // "It is currently (the current date)"

        System.out.println(alexisTest);
        // "Right away, sir. She certainly isn't sophisticated enough for that."

        System.out.println(alfredTest);
        // "At your service. As you wish, naturally."

        System.out.println(notRelevantTest);
        // "Right. And with that I shall retire."

        System.out.println(testGreetingWithDayPeriod);
        // "Good morning, Christian Demesa. Lovely to see you."

        System.out.println(testGreetingWithDayPeriodWrong);
        // "Excuse me, but it appears the time of day you chose was incorrect."

        // System.out.println(testGreetingWithoutDayPeriod);

        System.out.println(testQuestion);
        // "My master appears to be confused. I suppose that is nothing out of the ordinary."

        System.out.println(testExclaim);
        // "Why is my master always shouting? It appears they have a short temperment."

        System.out.println(testPeriod);
        // "A rather astute, yet mundane, observation."

        System.out.println(testNoPunctuation);
        //"I do believe my master is illiterate due to the lack of punctuation marks."

    }
}
