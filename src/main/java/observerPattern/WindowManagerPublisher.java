package observerPattern;

import java.util.ArrayList;

public class WindowManagerPublisher {
    ArrayList<WindowSubscriber> subscribers;
    void subscribe(WindowSubscriber s) {
        subscribers.add(s);
    }
    void unsubscribe(WindowSubscriber s) {
        subscribers.remove(s);
    }
    void notifySubscribers() {
        subscribers.forEach(c -> c.update(6, 6));
    }
}


