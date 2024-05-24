package observerPattern;

public class ConcreteWindowSubscriber implements WindowSubscriber{
    int posX;
    int posY;
    public ConcreteWindowSubscriber() {
        posX = 0;
        posY = 0;
    }
    public void update(int posX, int posY) {
        this.posX += posX;
        this.posY += posY;
    }
}
