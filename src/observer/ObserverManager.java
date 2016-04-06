package observer;

import java.util.Observer;

/**
 * Created by milan on 6.4.16..
 */
public class ObserverManager {
    private static MessageObserverable observerable;

    static {
        observerable = new MessageObserverable(null);
    }

    public static void addObserver(Observer observer) {
        observerable.addObserver(observer);
    }

    public static void removeObserver(Observer observer) { observerable.deleteObserver(observer);}

    public static void sendMessage(String message) {
        observerable.setMessage(message);
    }

}
