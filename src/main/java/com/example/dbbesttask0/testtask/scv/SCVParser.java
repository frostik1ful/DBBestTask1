package com.example.dbbesttask0.testtask.scv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCVParser {

    public List<List<String>> parse(String path) {
        List<List<String>> input = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                input.add(Arrays.asList(values));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
