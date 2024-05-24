package statePattern;

import statePattern.states.SmallMario;

public class Mario {
    State state;
    Mario() {
        this.state = new SmallMario(this);
    }
    public void setState(State state) {
        this.state = state;
    }
}
