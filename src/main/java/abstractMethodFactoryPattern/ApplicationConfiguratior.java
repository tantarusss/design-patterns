package abstractMethodFactoryPattern;

import abstractMethodFactoryPattern.factory.FullBodyRendererFactory;
import abstractMethodFactoryPattern.factory.RendererFactory;
import abstractMethodFactoryPattern.factory.WireframeRendererFactory;

public class ApplicationConfiguratior {
    public static void main(String[] args) throws Exception {
        String rendererContext = getRendererContext();
        RendererFactory factory;
        if (rendererContext.equals("Wireframe")) {
            factory = new WireframeRendererFactory();
        } else if (rendererContext.equals("FullBody")) {
            factory = new FullBodyRendererFactory();
        } else {
            throw new Exception("Error! Unknown Renderer Context");
        }
        Application app = new Application(factory);
    }
    private static String getRendererContext() {
        return "Wireframe";
    }
}
