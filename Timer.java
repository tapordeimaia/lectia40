package com.example.lectia40;

public class Timer {
    public int timp;

    public static final Timer timer = new Timer();
    //static - variabila aprtine la toate obiectele de clasa Timer
    public void setTimp(int timp){
        this.timp= timp;
    }

    public int getTimp(){
        return timer.timp;
    }

    public static Timer getInstance(){
        return timer;
    }
}
