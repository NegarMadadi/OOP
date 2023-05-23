package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {
    @Test
    void heartPrintsHeart() {
        assertEquals("\u2665",Suit.HEARTS.toString());
    }
}