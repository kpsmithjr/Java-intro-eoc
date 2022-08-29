package com.car;

public class Honda extends Car{
    private boolean isTurboCharged;

    Honda (boolean isTurboCharged) {
        isTurboCharged = true;
        super();
    }

    public boolean getTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean tc) {
        this.isTurboCharged = tc;
    }
}
