package com.tts.itemidentifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck simulatedDeck;
    private static final String TEST_DECK_NAME = "TEST DECK";
    private static final String TEST_ARG2 = "R";
    private static final int TEST_DECK_SIZE = 60;
    private static final String NEW_TEST_DECK_NAME = "UPDATED DECK";
    private static final String NEW_TEST_ARG2 = "G";
    private static final int NEW_TEST_DECK_SIZE = 100;

    @BeforeEach
    void setUp() {
        simulatedDeck = new Deck(TEST_DECK_NAME, TEST_ARG2, TEST_DECK_SIZE);
    }

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
        String arg1 = "Two Arg Constructor Deck";
        String arg2 = "BWU";
        try {
            new Deck(arg1, arg2);
        } catch (Error e) {
            System.out.println("Error in 2arg constructor: " + e);
            fail();
        }
        Deck testDeck = new Deck(arg1, arg2);
        assertNotEquals(null, testDeck);
    }

    @Test
    void constructorFull() {
        String arg1 = "Full Constructor Deck";
        String arg2 = "WUG";
        int arg3 = 60;
        try {
            new Deck(arg1, arg2, arg3);
        } catch (Error e) {
            System.out.println("Error in full arg constructor: " + e);
        }
        Deck testDeck = new Deck(arg1, arg2, arg3);
        assertNotEquals(null, testDeck);
    }

    // Getter Tests
    @Test
    void getName() {
        String testVariable = simulatedDeck.getName();
        assertEquals(TEST_DECK_NAME, testVariable);
    }

    @Test
    void getColors() {
        String testVariable = simulatedDeck.getColors();
        assertEquals(TEST_ARG2, testVariable);
    }

    @Test
    void getSize() {
        int testVariable = simulatedDeck.getSize();
        assertEquals(TEST_DECK_SIZE, testVariable);
    }

    // Setter Tests
    @Test
    void setName() {
        try{
            simulatedDeck.setName(NEW_TEST_DECK_NAME);
        } catch (Error e) {
            System.out.println("Error setting Variable One: "+ e);
        }
        assertEquals(NEW_TEST_DECK_NAME, simulatedDeck.getName());
    }

    @Test
    void setColors() {
        try{
            simulatedDeck.setColors(NEW_TEST_ARG2);
        } catch (Error e) {
            System.out.println("Error setting Variable Two: "+ e);
        }
        assertEquals(NEW_TEST_ARG2, simulatedDeck.getColors());
    }

    @Test
    void setSize() {
        try{
            simulatedDeck.setSize(NEW_TEST_DECK_SIZE);
        } catch (Error e) {
            System.out.println("Error setting Variable Three: "+ e);
        }
        assertEquals(NEW_TEST_DECK_SIZE, simulatedDeck.getSize());
    }

    // Boolean Return Test
    @Test
    void getLegalSize() {
        boolean retrievedBool = false;
        try {
            retrievedBool = simulatedDeck.getLegalSize();
        } catch (Error e){
            System.out.println("Error assigning Bool: " + e);
            fail();
        }
        assertNotEquals(null,retrievedBool);
    }

    // String Return Test
    @Test
    void returnString() {
        String retrievedString = "";
        try {
            retrievedString = simulatedDeck.getFullDescription();
        } catch (Error e){
            System.out.println("Error assigning String: " + e);
            fail();
        }
        assertNotEquals(null,retrievedString);
    }
}