package com.perficient.com;

public class Circle implements IFigure {

    private float radio;

    @Override
    public float area() {
        return (float) (Math.PI * (this.radio * this.radio));
    }

    @Override
    public float perimeter() {
        return ((float) (Math.PI * (this.radio * this.radio))) / 2;
    }

    public Circle(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

}
