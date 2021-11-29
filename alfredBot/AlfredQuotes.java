import java.util.Date;
import java.time.ZonedDateTime;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // Uses .format() for string interpolation.
        String nameGreeting = String.format("Hello, %s. Lovely to see you.", name);
        return nameGreeting;
    }
    
    public String dateAnnouncement() {
        // Date() grabs the current date using the above import.
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // indexOf() will look if what is given in the parentheses is in conversation, and will return -1 if it doesn't exist.
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        // Runs if "Alexis" exists.
        if(alexis > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        // Runs if "Alexis" doesn't exist and "Alfred" exists.
        else if(alfred > -1) {
            return "At your service. As you wish, naturally.";
        }
        // Runs if neither exist.
        else {
            return "Right. And with that I shall retire.";
        }
    }
    
    public String guestGreetingWithDayPeriod(String name, String dayPeriod) {
        int morning = dayPeriod.indexOf("morning");
        int afternoon = dayPeriod.indexOf("afternoon");
        int evening = dayPeriod.indexOf("evening");
        // Runs if the user tries to put it in more than one day period.
        if((morning > -1 && afternoon > -1) || (afternoon > -1 && evening > -1) || (evening > -1 && morning > -1)) {
            return "I am terribly sorry, but you can only choose one time of day."
        } // Runs if the user puts in exactly one day period.
        else if(morning > -1 || afternoon > -1 || evening > -1) {
            return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        } // Runs if the user doesn't put a day period.
        else {
            return "Excuse me, but it appears the time of day you chose was incorrect.";
        }
    }

    /*
    Does not currently work

    public String guestGreetingWithoutDayPeriod(String name) {
        long time = ZonedDateTime.now().toInstant().toEpochMilli();
        float hour = time;
        if(hour > 3 && hour < 13) {
            return String.format("Good morning, %s. We are in this current hour: %.2f", name, hour);
        }
        else if(hour > 12 && hour < 22) {
            return String.format("Good afternoon, %s. We are in this current hour: %.2f", name, hour);
        }
        else {
            return String.format("Good evening, %s. We are in this current hour: %.2f", name, hour);
        }
    }
    */
	
    public String snarkyRemark(String conversation) {
        int question = conversation.indexOf("?");
        int exclaim = conversation.indexOf("!");
        int period = conversation.indexOf(".");
        // Runs if the above punctuation marks are not provided.
        if(question == -1 && exclaim == -1 && period == -1) {
            return "I do believe my master is illiterate due to the lack of punctuation marks.";
        }
        // Runs if there is no question mark.
        else if(question > -1) {
            return "My master appears to be confused. I suppose that is nothing out of the ordinary.";
        }
        // Runs if there is no exclamation point, but there is a question mark.
        else if(exclaim > -1) {
            return "Why is my master always shouting? It appears they have a short temperment.";
        }
        // Runs if there is no period, but there is an question mark and exclamation point.
        else if(period > -1) {
            return "A rather astute, yet mundane, observation.";
        }
        // Never runs, but I needed an else statement here.
        else {
            return "You are quite remarkable. It is an impossibility for this text to appear.";
        }
    }
    
}