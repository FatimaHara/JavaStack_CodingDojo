import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {

        return "Hello:" + name  + "Lovely to see you.";
    }
    
    public String dateAnnouncement() {

        return "It is currently " + java.time.LocalDateTime.now();

    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")){
            return "Right away, sir. She certainly isnt sophisticated enough for that.";
        }
        else if (conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire." ;
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

