package abstractMethodFactoryPattern.factory;

import abstractMethodFactoryPattern.boxRenderer.BoxRenderer;
import abstractMethodFactoryPattern.boxRenderer.BoxWireframeRenderer;
import abstractMethodFactoryPattern.sphereRenderer.SphereRenderer;
import abstractMethodFactoryPattern.sphereRenderer.SphereWireframeRenderer;

public class WireframeRendererFactory implements RendererFactory{
    @Override
    public BoxRenderer createBoxRenderer() {
        return new BoxWireframeRenderer();
    }

    @Override
    public SphereRenderer createSphereRenderer() {
        return new SphereWireframeRenderer();
    }
}
