package decoratorPattern;

public class BaseDecorator implements Component{
    private Component wrappee;
    BaseDecorator(Component c) {
        wrappee = c;
    }

    @Override
    public void foo() {
        wrappee.foo();
    }
}
