package statePattern.states;

import statePattern.Mario;
import statePattern.State;

public class FireMario extends State {
    public FireMario(Mario mario) {
        super(mario);
    }
    public void onDamage() {
        mario.setState(new SuperMario(mario));
    }
    public void onMushroom() {
        //nothing
    }
    public void onFireFlower() {
        //nothing
    }
    public void onFeather() {
        mario.setState(new CapeMario(mario));
    }
}
