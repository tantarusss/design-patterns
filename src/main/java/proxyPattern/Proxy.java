package proxyPattern;

public class Proxy implements Service{
    Service realService;
    private void proxyOperation() {
        System.out.println("Proxy");
    }
    Proxy(Service service) {
        this.realService = service;
    }

    @Override
    public void doSomething() {
        proxyOperation();
        realService.doSomething();
    }
}
