package decoratorPattern;

//TODO ???
public class Application {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.foo();
        component = new ConcreteDecorator(component);
        component.foo();
    }

}
