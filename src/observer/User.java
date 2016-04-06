package observer;

import proxy.ProxyServer;
import proxy.Request;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by milan on 6.4.16..
 */
public class User implements Observer {
    private String name;
    private String address;
    private ProxyServer proxyServer = new ProxyServer();

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void subscribe() {
        ObserverManager.addObserver(this);
    }

    public void sendEmailToAllGroup(String message) {
        Request request = new Request();
        request.address = this.address;
        request.message = message;
        proxyServer.send(request);
    }

    @Override
    public void update(Observable o, Object arg) {
        MessageObserverable messageObserverable = (MessageObserverable) o;
        System.out.println("New email for: " + this.name + ", " + String.valueOf(messageObserverable.getMessage()));
    }
}
