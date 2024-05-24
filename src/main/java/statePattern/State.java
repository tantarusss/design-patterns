package statePattern;

public abstract class State {
    protected Mario mario;
    public State(Mario mario) {
        this.mario = mario;
    }
    public abstract void onDamage();
    public abstract void onMushroom();
    public abstract void onFireFlower();
    public abstract void onFeather();
}
