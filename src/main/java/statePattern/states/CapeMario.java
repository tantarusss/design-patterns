package statePattern.states;

import statePattern.Mario;
import statePattern.State;

public class CapeMario extends State {
    public CapeMario(Mario mario) {
        super(mario);
    }
    public void onDamage() {
        mario.setState(new SuperMario(mario));
    }
    public void onMushroom() {
        //nothing
    }
    public void onFireFlower() {
        mario.setState(new FireMario(mario));
    }
    public void onFeather() {
        //nothing
    }
}
