package com.company;

public class State<S extends Number> implements Election<S> {
    S government;
    S government2;

    public State(S government, S government2) {
        this.government = government;
        this.government2 = government2;
    }
}