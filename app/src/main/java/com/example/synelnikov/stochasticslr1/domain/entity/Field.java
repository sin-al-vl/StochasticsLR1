package com.example.synelnikov.stochasticslr1.domain.entity;

public class Field {

    private int width;

    private int height;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean contains(int coordinateX, int coordinateY) {
        return coordinateX >= 0 && coordinateX <= width &&
                coordinateY >= 0 && coordinateY <= height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
