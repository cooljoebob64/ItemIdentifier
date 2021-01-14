package com.tts.itemidentifier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck simulatedDeck;
    private static final int TEST_ARG1 = 0, TEST_ARG2 = 0, TEST_ARG3 = 0, TEST_ARG4 = 0;

    @BeforeEach
    void setUp() {
        simulatedDeck = new Deck(TEST_ARG1, TEST_ARG2, TEST_ARG3, TEST_ARG4);
    }
//
//    @AfterEach
//    void tearDown() {
//    }

    // Constructor Tests
    @Test
    void constructorEmpty() {
        try {
            new Deck();
        } catch (Error e) {
            System.out.println("Error making new Deck with empty constructor: " + e);
            fail();
        }
        Deck testDeck = new Deck();
        assertNotEquals(null, testDeck);
    }

    @Test
    void constructorTwoArg() {
        int arg1 = 1;
        int arg2 = 2;
        try {
//            new Deck(arg1, arg2);
        } catch (Error e) {
            System.out.println("Error in 2arg constructor: " + e);
            fail();
        }
        Deck testDeck = new Deck(arg1, arg2);
        assertNotEquals(null, testDeck);
    }

    @Test
    void constructorFull() {
        int arg1 = 1;
        int arg2 = 2;
        int arg3 = 3;
        int arg4 = 4;
        try {
            new Deck(arg1, arg2, arg3, arg4);
        } catch (Error e) {
            System.out.println("Error in full arg constructor: " + e);
        }
        Deck testDeck = new Deck(arg1, arg2, arg3, arg4);
        assertNotEquals(null, testDeck);
    }

    // Getter Tests
    @Test
    void getVariableOne() {
        int testVariable = simulatedDeck.getVariableOne();
        assertEquals(TEST_ARG1, testVariable);
    }

    @Test
    void getVariableTwo() {
        int testVariable = simulatedDeck.getVariableTwo();
        assertEquals(TEST_ARG2, testVariable);
    }

    @Test
    void getVariableThree() {
        int testVariable = simulatedDeck.getVariableThree();
        assertEquals(TEST_ARG3, testVariable);
    }

    // Setter Tests
    @Test
    void setVariableOne() {
        fail();
    }

    @Test
    void setVariableTwo() {
        fail();
    }

    @Test
    void setVariableThree() {
        fail();
    }

    // Boolean Return Test
    @Test
    void returnBool() {
        fail();
    }

    // String Return Test
    @Test
    void returnString() {
        fail();
    }

}