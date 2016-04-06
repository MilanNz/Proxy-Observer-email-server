package observer;

import java.util.Observable;

/**
 * Created by milan on 6.4.16..
 */
public class MessageObserverable extends Observable {
    private String message;

    public MessageObserverable(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String score) {
        this.message = score;
        setChanged();
        notifyObservers();
    }
}

