package com.perficient.com;

public class Square implements IFigure {

    private float side;

    @Override
    public float area() {
        return side * side;
    }

    @Override
    public float perimeter() {
        return side * 4;
    }

    public float getSide() {
        return side;
    }

    public Square(float side) {
        this.side = side;
    }
}
