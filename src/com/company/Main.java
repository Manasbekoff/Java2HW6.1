package com.company;

public class Main {

    public static void main(String[] args) {
    State<Number> state = new State<>(312, 7);
    state.ElectGovernment();
        System.out.println(state.getGovernment());
        System.out.println(state.getGovernment2());
}
}
