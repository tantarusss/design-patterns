package statePattern.states;

import statePattern.Mario;
import statePattern.State;

public class SmallMario extends State {
    public SmallMario(Mario mario) {
        super(mario);
    }
    public void onDamage() {
        //dead
    }
    public void onMushroom() {
        mario.setState(new SuperMario(mario));
    }
    public void onFireFlower() {
        mario.setState(new FireMario(mario));
    }
    public void onFeather() {
        mario.setState(new CapeMario(mario));
    }
}
