package com.company;

public class State<S extends Number> implements Electionable <S> {
    private S government;
    private S government2;

    public State(S government, S government2) {
        this.government = government;
        this.government2 = government2;
    }

    public S getGovernment() {
        return government;
    }

    public S getGovernment2() {
        return government2;
    }

    public S ElectGovernment() {
        System.out.println("Select new government");
        return null;
    }
}