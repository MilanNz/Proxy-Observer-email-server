import observer.MessageObserverable;
import observer.User;

/**
 * Created by milan on 6.4.16..
 */
public class Main {

    public static void main(String[] args) {
        // Create users
        User yohn = new User("Yohn", "yohn@yahoo.com");
        User peter = new User("Peter", "peter@gmail.com");

        // subscibe users
        yohn.subscribe();
        peter.subscribe();

        // send message to whole group
        yohn.sendEmailToAllGroup("Hey guys!");
        peter.sendEmailToAllGroup("You got 2 milions!");

    }

}
