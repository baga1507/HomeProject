package org.example;

import lombok.Data;

@Data
public class Closet implements Furniture {
    private double height;
    private double length;
    private double width;

    @Override
    public double getArea() {
        return (height * width * 4) + (length * width * 2);
    }
}
