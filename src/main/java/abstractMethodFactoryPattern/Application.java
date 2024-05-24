package abstractMethodFactoryPattern;

import abstractMethodFactoryPattern.boxRenderer.BoxRenderer;
import abstractMethodFactoryPattern.factory.RendererFactory;
import abstractMethodFactoryPattern.sphereRenderer.SphereRenderer;

public class Application {
    private RendererFactory factory;
    private SphereRenderer sphereRenderer;
    private BoxRenderer boxRenderer;
    public Application(RendererFactory factory) {
        this.factory = factory;
    }

    void createScene() {
        this.sphereRenderer = factory.createSphereRenderer();
        this.boxRenderer = factory.createBoxRenderer();
    }
    void renderScene() {
        sphereRenderer.drawSphere();
        boxRenderer.drawBox();
    }
}
