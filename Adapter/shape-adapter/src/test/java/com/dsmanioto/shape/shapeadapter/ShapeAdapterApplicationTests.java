package com.dsmanioto.shape.shapeadapter;

import com.dsmanioto.shape.shapeadapter.adapter.LineAdapter;
import com.dsmanioto.shape.shapeadapter.adapter.RectangleAdapter;
import com.dsmanioto.shape.shapeadapter.model.Line;
import com.dsmanioto.shape.shapeadapter.model.Rectangle;
import com.dsmanioto.shape.shapeadapter.model.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ShapeAdapterApplicationTests {

    @Test
    void test() {
        List<Shape> shapes = Arrays.asList(new RectangleAdapter(new Rectangle()), new LineAdapter(new Line()));
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        shapes.stream().forEach(shape -> shape.draw(x1, y1, x2, y2));
    }

}
