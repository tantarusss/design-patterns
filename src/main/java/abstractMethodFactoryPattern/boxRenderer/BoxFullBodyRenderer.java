package abstractMethodFactoryPattern.boxRenderer;

public class BoxFullBodyRenderer implements BoxRenderer {
    @Override
    public void drawBox() {
        System.out.println("Drawing Full Body Box");
    }
}
