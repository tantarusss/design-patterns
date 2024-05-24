package proxyPattern;

public class Application {
    Service service = new Proxy(new ServiceImpl());
}
