package com.example.synelnikov.stochasticslr1.domain.entity;

public class ExperimentResult {

    private int freeze;

    private int goneLeft;

    private int goneRight;

    private int goneUp;

    private int goneDown;

    public ExperimentResult() {
        freeze = 0;
        goneLeft = 0;
        goneRight = 0;
        goneDown = 0;
        goneUp = 0;
    }

    public void freeze() {
        freeze++;
    }

    public void goneLeft() {
        goneLeft++;
    }

    public void goneRight() {
        goneRight++;
    }

    public void goneUp() {
        goneUp++;
    }

    public void goneDown() {
        goneDown++;
    }

    public int getFreeze() {
        return freeze;
    }

    public int getGoneLeft() {
        return goneLeft;
    }

    public int getGoneRight() {
        return goneRight;
    }

    public int getGoneUp() {
        return goneUp;
    }

    public int getGoneDown() {
        return goneDown;
    }
}
