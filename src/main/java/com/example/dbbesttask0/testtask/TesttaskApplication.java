package com.example.dbbesttask0.testtask;

import com.example.dbbesttask0.testtask.gui.GuiFx;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesttaskApplication {

    public static void main(String[] args) {
        Application.launch(GuiFx.class,args);
    }

}
