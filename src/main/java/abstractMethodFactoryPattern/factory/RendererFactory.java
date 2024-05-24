package abstractMethodFactoryPattern.factory;

import abstractMethodFactoryPattern.boxRenderer.BoxRenderer;
import abstractMethodFactoryPattern.sphereRenderer.SphereRenderer;

public interface RendererFactory {
    public BoxRenderer createBoxRenderer();
    public SphereRenderer createSphereRenderer();
}
