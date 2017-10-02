package com.example.synelnikov.stochasticslr1.domain.entity;

public class Unit {

    private int coordinateX;

    private int coordinateY;

    private float freezeProbability;

    private float moveLeftProbability;

    private float moveRightProbability;

    private float moveUpProbability;

    private float moveDownProbability;

    public Unit(int coordinateX,
                int coordinateY,
                float freezeProbability,
                float moveLeftProbability,
                float moveRightProbability,
                float moveUpProbability,
                float moveDownProbability) {

        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.freezeProbability = freezeProbability;
        this.moveLeftProbability = moveLeftProbability;
        this.moveRightProbability = moveRightProbability;
        this.moveUpProbability = moveUpProbability;
        this.moveDownProbability = moveDownProbability;
    }

    public void moveLeft() {
        coordinateX =- 1;
    }

    public void moveRight() {
        coordinateX =+ 1;
    }

    public void moveUp() {
        coordinateY =+ 1;
    }

    public void moveDown() {
        coordinateY =- 1;
    }

    public boolean isProbabilitiesCorrect() {
        return (freezeProbability + moveLeftProbability + moveRightProbability +
                moveUpProbability + moveDownProbability) == 1;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setFreezeProbability(float freezeProbability) {
        this.freezeProbability = freezeProbability;
    }

    public void setMoveLeftProbability(float moveLeftProbability) {
        this.moveLeftProbability = moveLeftProbability;
    }

    public void setMoveRightProbability(float moveRightProbability) {
        this.moveRightProbability = moveRightProbability;
    }

    public void setMoveUpProbability(float moveUpProbability) {
        this.moveUpProbability = moveUpProbability;
    }

    public void setMoveDownProbability(float moveDownProbability) {
        this.moveDownProbability = moveDownProbability;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public float getFreezeProbability() {
        return freezeProbability;
    }

    public float getMoveLeftProbability() {
        return moveLeftProbability;
    }

    public float getMoveRightProbability() {
        return moveRightProbability;
    }

    public float getMoveUpProbability() {
        return moveUpProbability;
    }

    public float getMoveDownProbability() {
        return moveDownProbability;
    }
}
