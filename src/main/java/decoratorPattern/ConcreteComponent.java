package decoratorPattern;

public class ConcreteComponent implements Component {
    @Override
    public void foo() {
        System.out.println("foo");
    }
}
