package com.tts;

import com.tts.itemidentifier.Deck;
import com.tts.itemidentifier.Pet;

public class Main {
    public static final String DEMO_PET_NAME = "Sparky";

    public static final int DEMO_PET_AGE = 33;
    public static final String DEMO_PET_LOC = "Under the bed";
    public static final String DEMO_PET_TYPE = "Bee";

    public static final String NEW_DEMO_PET_NAME = "Hambones";
    public static final int NEW_DEMO_PET_AGE = 11;
    public static final String NEW_DEMO_PET_LOC = "Behind you";
    public static final String NEW_DEMO_PET_TYPE = "Ghost";

    private final static String DEMO_DECK_NAME = "Tub Thumpers";
    private final static String DEMO_DECK_COLORS = "WUG";
    private final static int DEMO_DECK_SIZE = 60;

    private final static String NEW_DEMO_DECK_NAME = "Battle Boat Deluxe";
    private final static String NEW_DEMO_DECK_COLORS = "GUW";
    private final static int NEW_DEMO_DECK_SIZE = 40;

    public static void main(String[] args) {


        System.out.println("Making a new Pet!");
        Pet demoPet = new Pet(DEMO_PET_NAME, DEMO_PET_AGE, DEMO_PET_LOC, DEMO_PET_TYPE);
        testPetGetters(demoPet);
        testPetSetters(demoPet, NEW_DEMO_PET_NAME, NEW_DEMO_PET_AGE, NEW_DEMO_PET_LOC, NEW_DEMO_PET_TYPE);
        testPetGetters(demoPet);


        System.out.println("Making a new Deck!");
        Deck demoDeck = new Deck(DEMO_DECK_NAME, DEMO_DECK_COLORS, DEMO_DECK_SIZE);
        testDeckGetters(demoDeck);
        testDeckSetters(demoDeck, NEW_DEMO_DECK_NAME, NEW_DEMO_DECK_COLORS, NEW_DEMO_DECK_SIZE);
        testDeckGetters(demoDeck);
    }

    private static void testPetGetters(Pet demoPet) {
        System.out.print("Getting pet name: ");
        System.out.println(demoPet.getName());

        System.out.print("Getting pet age: ");
        System.out.println(demoPet.getAge());

        System.out.print("Getting pet location: ");
        System.out.println(demoPet.getLocation());

        System.out.print("Getting pet type: ");
        System.out.println(demoPet.getType());
    }

    private static void testPetSetters(Pet demoPet, String newName, int newAge, String newLocation, String newType) {
        System.out.println("Setting pet name to: " + newName);
        demoPet.setName(newName);

        System.out.println("Setting pet age to: " + newAge);
        demoPet.setAge(newAge);

        System.out.println("Setting pet location to: " + newLocation);
        demoPet.setLocation(newLocation);

        System.out.println("Setting pet type to: " + newType);
        demoPet.setType(newType);
    }

    private static void testDeckGetters(Deck demoDeck) {
        System.out.print("Trying to get name: ");
        System.out.println(demoDeck.getName());

        System.out.print("Trying to get colors: ");
        System.out.println(demoDeck.getColors());

        System.out.print("Trying to get size: ");
        System.out.println(demoDeck.getSize());

        System.out.print("Trying to get legality: ");
        System.out.println(demoDeck.getLegalSize());

        System.out.println("Trying to get full deck description:");
        System.out.println(demoDeck.getFullDescription());
    }

    private static void testDeckSetters(Deck demoDeck,String newName,String newColors, int newSize) {
        System.out.println("Setting deck name to: " + newName);
        demoDeck.setName(newName);

        System.out.println("Setting deck colors to: " + newColors);
        demoDeck.setColors(newColors);

        System.out.println("Setting deck size to: " + newSize);
        demoDeck.setSize(newSize);
    }
}
