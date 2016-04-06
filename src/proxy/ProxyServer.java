package proxy;

import observer.ObserverManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by milan on 6.4.16..
 */
public class ProxyServer extends Server {
    private List<String> spamAddresses = new ArrayList<>();

    public ProxyServer() {
        spamAddresses.add("some@gmail.com");
        spamAddresses.add("some2@gmail.com");
        spamAddresses.add("some3@gmail.com");
        spamAddresses.add("peter@gmail.com");
    }

    @Override
    public void send(Request request) {
        if (!spamAddresses.contains(request.address)) {
            super.send(request);
        }
    }

}
