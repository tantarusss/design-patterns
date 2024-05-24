package facadePattern;

public class GameObject {
    PhysicsEngine physicsEngine;
    Renderer renderer;
    RigidBodyCreator rigidBodyCreator;
    TextureRenderer textureRenderer;
    String name;
    GameObject(String name) {
        this.name = name;
        this.physicsEngine = new PhysicsEngine();
        this.renderer = new Renderer();
        this.rigidBodyCreator = new RigidBodyCreator();
        this.textureRenderer = new TextureRenderer();
    }
}
