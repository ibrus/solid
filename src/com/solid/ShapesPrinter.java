package com.solid;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(Shape shapes[]) {
        return "{shapesSum: " + areaCalculator.sum(shapes) + "}";
    }

    public String csv(Shape shapes[]) {
        return "shapes_sum," + areaCalculator.sum(shapes);
    }
}
