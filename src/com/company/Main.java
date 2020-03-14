package com.company;

public class Main {

    public static void main(String[] args) {
    State<Number> state = new State<>(312, 7);
    state.elect();
        System.out.println(state.government);
        System.out.println(state.government2);

}
}
