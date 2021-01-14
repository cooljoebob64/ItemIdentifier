package com.tts.itemidentifier;

public class Deck {

    private int var1;
    private int var2;
    private int var3;
    private boolean myBool;
    private String myString;

    private final static int DEFAULT_VAR1 = 1;
    private final static int DEFAULT_VAR2 = 2;
    private final static int DEFAULT_VAR3 = 3;

    public Deck(){
        this(DEFAULT_VAR1, DEFAULT_VAR2, DEFAULT_VAR3);
    }

    public Deck(int arg1, int arg2){
        this(arg1,arg2, DEFAULT_VAR3);
    }

    public Deck(int arg1, int arg2, int arg3){
        this.var1 = arg1;
        this.var2 = arg2;
        this.var3 = arg3;

        this.myBool = true;
        this.myString = "This is a String!";
    }


    public int getVariableOne(){
        return this.var1;
    }

    public int getVariableTwo(){
        return this.var2;
    }

    public int getVariableThree(){
        return this.var3;
    }

    public void setVariableOne(int newVar){
        this.var1 = newVar;
    }
    public void setVariableTwo(int newVar){
        this.var2 = newVar;
    }
    public void setVariableThree(int newVar){
        this.var3 = newVar;
    }

    public boolean getBool(){
        return myBool;
    }
    public String getString(){
        return myString;
    }

}
