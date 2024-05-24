package decoratorPattern;

public class ConcreteDecorator extends BaseDecorator {
    ConcreteDecorator(Component c) {
        super(c);
    }

    public void foo() {
        super.foo();
        bar();
    }
    private void bar() {
        System.out.println("bar");
    }
}
