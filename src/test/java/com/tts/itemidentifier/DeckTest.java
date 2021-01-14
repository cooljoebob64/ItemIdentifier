package com.tts.itemidentifier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck simulatedDeck;
    private static final int TEST_ARG1 = 0, TEST_ARG2 = 0, TEST_ARG3 = 0, TEST_ARG4 = 0;
    private static final int NEW_TEST_ARG1 = 0, NEW_TEST_ARG2 = 2, NEW_TEST_ARG3 = 3, NEW_TEST_ARG4 = 4;

    @BeforeEach
    void setUp() {
        simulatedDeck = new Deck(TEST_ARG1, TEST_ARG2, TEST_ARG3, TEST_ARG4);
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
        int arg1 = 1;
        int arg2 = 2;
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
        try{
            simulatedDeck.setVariableOne(NEW_TEST_ARG1);
        } catch (Error e) {
            System.out.println("Error setting Variable One: "+ e);
        }
        assertEquals(NEW_TEST_ARG1, simulatedDeck.getVariableOne());
    }

    @Test
    void setVariableTwo() {
        try{
            simulatedDeck.setVariableTwo(NEW_TEST_ARG2);
        } catch (Error e) {
            System.out.println("Error setting Variable Two: "+ e);
        }
        assertEquals(NEW_TEST_ARG2, simulatedDeck.getVariableTwo());
    }

    @Test
    void setVariableThree() {
        try{
            simulatedDeck.setVariableThree(NEW_TEST_ARG3);
        } catch (Error e) {
            System.out.println("Error setting Variable Three: "+ e);
        }
        assertEquals(NEW_TEST_ARG3, simulatedDeck.getVariableThree());
    }

    // Boolean Return Test
    @Test
    void returnBool() {
        Boolean retrievedBool = false;
        try {
            retrievedBool = simulatedDeck.getBool();
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
            retrievedString = simulatedDeck.getString();
        } catch (Error e){
            System.out.println("Error assigning String: " + e);
            fail();
        }
        assertNotEquals(null,retrievedString);
    }

}