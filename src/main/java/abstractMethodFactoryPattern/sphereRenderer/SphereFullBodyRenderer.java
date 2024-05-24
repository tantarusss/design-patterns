package abstractMethodFactoryPattern.sphereRenderer;

public class SphereFullBodyRenderer implements SphereRenderer {
    @Override
    public void drawSphere() {
        System.out.println("Drawing Full Body Sphere");
    }
}
