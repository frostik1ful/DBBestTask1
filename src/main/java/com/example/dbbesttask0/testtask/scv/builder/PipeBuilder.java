package com.example.dbbesttask0.testtask.scv.builder;

import com.example.dbbesttask0.testtask.entity.Pipe;

import java.util.ArrayList;
import java.util.List;

public class PipeBuilder extends Builder {

    @Override
    public List<Pipe> build(String path) {
        List<Pipe> pipes = new ArrayList<>();
        List<List<String>> parsed = getParser().parse(path);


        for (int i = 1; i < parsed.size(); i++) {
            List<String> row = parsed.get(i);
            pipes.add(new Pipe(Integer.parseInt(row.get(0)), Integer.parseInt(row.get(1)), Integer.parseInt(row.get(2))));
        }


        return pipes;
    }
}
