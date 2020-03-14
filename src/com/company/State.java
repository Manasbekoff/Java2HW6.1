package com.company;

public class State<S extends Number> implements Electionable<S> {
    S government;
    S government2;

    public State(S government, S government2) {
        this.government = government;
        this.government2 = government2;
    }

    public void elect() {
        System.out.println("Elect new government");
    }
}