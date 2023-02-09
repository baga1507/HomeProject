package org.example;

import lombok.Data;

@Data
public class RoundArmchair implements Furniture {
    private double radius;
    private double height;

    @Override
    public double getArea() {
        return 6 * radius * (radius + height);
    }
}
