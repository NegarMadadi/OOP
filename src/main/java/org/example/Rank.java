package org.example;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    JACK,
    QUEEN,
    KING;

    public int getValue() {
        return switch (this) {
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;
        };
    }
}
