package com.example.dbbesttask0.testtask.gui;

import com.example.dbbesttask0.testtask.logic.Answer;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;


public class AnswerPane extends Pane {
    private Label label;

    public AnswerPane(Answer answer) {
        this.label = new Label();
        if (answer.isWayFound()) {
            label.setText(answer.isWayFound() + " length " + answer.getLength());
        } else {
            label.setText(answer.isWayFound() + "");
        }
        label.setFont(Font.font("Cambria", 20));
        getChildren().add(label);

    }
}
