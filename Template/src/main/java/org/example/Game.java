package org.example;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template Method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
