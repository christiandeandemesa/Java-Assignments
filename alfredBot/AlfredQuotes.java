import java.util.Date;
import java.time.ZonedDateTime;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String nameGreeting = String.format("Hello, %s. Lovely to see you.", name);
        return nameGreeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if(alexis > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(alfred > -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire." ;
        }
    }
    
    public String guestGreetingWithDayPeriod(String name, String dayPeriod) {
        int morning = dayPeriod.indexOf("morning");
        int afternoon = dayPeriod.indexOf("afternoon");
        int evening = dayPeriod.indexOf("evening");
        if(morning > -1 || afternoon > -1 || evening > -1) {
            return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        }
        else {
            return "Excuse me, but it appears the time of day you chose was incorrect.";
        }
    }

    // Does not currently work
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
	
    public String snarkyRemark(String conversation) {
        int question = conversation.indexOf("?");
        int exclaim = conversation.indexOf("!");
        int period = conversation.indexOf(".");
        if(question == -1 && exclaim == -1 && period == -1) {
            return "I do believe my master is illiterate due to the lack of punctuation marks.";
        }
        else if(question > -1) {
            return "My master appears to be confused. I suppose that is nothing out of the ordinary.";
        }
        else if(exclaim > -1) {
            return "Why is my master always shouting? It appears they have a short temperment.";
        }
        else if(period > -1) {
            return "A rather astute, yet mundane, observation.";
        }
        else {
            return "You are quite remarkable. It is an impossibility for this text to appear.";
        }
    }
}

