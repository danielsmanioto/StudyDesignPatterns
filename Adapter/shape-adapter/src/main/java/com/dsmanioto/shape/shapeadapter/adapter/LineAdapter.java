package com.dsmanioto.shape.shapeadapter.adapter;

import com.dsmanioto.shape.shapeadapter.model.Line;
import com.dsmanioto.shape.shapeadapter.model.Shape;

public class LineAdapter implements Shape {

    private Line adaptee;

    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }

}
