package observerPattern;

public class Application {
    public static void main(String[] args) {
        WindowManagerPublisher publisher = new WindowManagerPublisher();
        ConcreteWindowSubscriber s = new ConcreteWindowSubscriber();
        publisher.subscribe(s);
        publisher.notifySubscribers();
    }
}
