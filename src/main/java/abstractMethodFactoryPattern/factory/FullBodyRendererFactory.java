package abstractMethodFactoryPattern.factory;

import abstractMethodFactoryPattern.boxRenderer.BoxFullBodyRenderer;
import abstractMethodFactoryPattern.boxRenderer.BoxRenderer;
import abstractMethodFactoryPattern.sphereRenderer.SphereFullBodyRenderer;
import abstractMethodFactoryPattern.sphereRenderer.SphereRenderer;

public class FullBodyRendererFactory implements RendererFactory {
    @Override
    public BoxRenderer createBoxRenderer() {
        return new BoxFullBodyRenderer();
    }

    @Override
    public SphereRenderer createSphereRenderer() {
        return new SphereFullBodyRenderer();
    }
}
