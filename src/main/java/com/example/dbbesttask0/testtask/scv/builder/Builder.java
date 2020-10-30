package com.example.dbbesttask0.testtask.scv.builder;

import com.example.dbbesttask0.testtask.scv.SCVParser;

import java.util.List;

public abstract class Builder {
    private SCVParser parser = new SCVParser();

    public abstract List build(String path);

    public SCVParser getParser() {
        return parser;
    }
}
