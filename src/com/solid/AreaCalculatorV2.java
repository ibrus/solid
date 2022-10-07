package com.solid;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {

    @Override
    public int sum(Shape shapes[]) {
        int sum = 0;
        for(Shape shape: shapes){
            sum += shape.area();
        }
        return sum;
    }

}
