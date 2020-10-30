package com.example.dbbesttask0.testtask.scv.builder;

import com.example.dbbesttask0.testtask.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class PointBuilder extends Builder {

    @Override
    public List<Point> build(String path) {
        List<Point> points = new ArrayList<>();
        List<List<String>> parsed = getParser().parse(path);

        for (int i = 1; i < parsed.size(); i++) {
            List<String> row = parsed.get(i);
            points.add(new Point(Integer.parseInt(row.get(0)), Integer.parseInt(row.get(1))));
        }
        return points;
    }
}
