package abstractMethodFactoryPattern.boxRenderer;

public class BoxWireframeRenderer implements BoxRenderer {
    @Override
    public void drawBox() {
        System.out.println("Drawing Wireframe Box");
    }
}
