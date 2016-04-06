package proxy;

import observer.ObserverManager;

/**
 * Created by milan on 6.4.16..
 */
public class Server {
    public void send(Request request) {
        ObserverManager.sendMessage(request.message + ", from: " + request.address);
    }
}
