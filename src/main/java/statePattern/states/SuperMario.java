package statePattern.states;

import statePattern.Mario;
import statePattern.State;

public class SuperMario extends State {
    public SuperMario(Mario mario) {
        super(mario);
    }
    public void onDamage() {
        mario.setState(new SmallMario(mario));
    }
    public void onMushroom() {
        //nothing
    }
    public void onFireFlower() {
        mario.setState(new FireMario(mario));
    }
    public void onFeather() {
        mario.setState(new CapeMario(mario));
    }
}
