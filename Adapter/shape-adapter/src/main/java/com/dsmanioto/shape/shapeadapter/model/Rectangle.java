package com.dsmanioto.shape.shapeadapter.model;

import com.dsmanioto.shape.shapeadapter.model.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Rectangle with coordinate left-down point (" + x1 + ";" + y1 + "), width: " + x2
                + ", height: " + y2);
    }

}
