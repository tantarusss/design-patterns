package abstractMethodFactoryPattern.sphereRenderer;

public class SphereWireframeRenderer implements SphereRenderer {

    @Override
    public void drawSphere() {
        System.out.println("Drawing Wireframe Sphere");
    }
}
