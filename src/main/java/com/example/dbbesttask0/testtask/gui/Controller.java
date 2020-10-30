package com.example.dbbesttask0.testtask.gui;

import com.example.dbbesttask0.testtask.entity.Pipe;
import com.example.dbbesttask0.testtask.entity.Point;
import com.example.dbbesttask0.testtask.logic.PipeManager;
import com.example.dbbesttask0.testtask.repository.PipeRepository;
import com.example.dbbesttask0.testtask.scv.builder.PipeBuilder;
import com.example.dbbesttask0.testtask.scv.builder.PointBuilder;
import com.example.dbbesttask0.testtask.service.classes.PipeImplService;
import com.example.dbbesttask0.testtask.service.classes.PointImplService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class Controller {
    @FXML
    private VBox vBox;
    @FXML
    private Button calculateButton;
    private final FileChooser fileChooser = new FileChooser();

    private final PipeImplService pipeImplService;
    private final PointImplService pointImplService;

    private final PipeBuilder pipeBuilder;
    private final PointBuilder pointBuilder;
    private final PipeManager pipeManager;

    private boolean pipeFileLoaded;
    private boolean pointsFileLoaded;

    private File pipesFile;
    private File pointsFile;

    @Autowired
    PipeRepository pipeRepository;


    public Controller(PipeImplService pipeImplService, PointImplService pointImplService, PipeBuilder pipeBuilder, PointBuilder pointBuilder, PipeManager pipeManager) {
        this.pipeImplService = pipeImplService;
        this.pointImplService = pointImplService;
        this.pipeBuilder = pipeBuilder;
        this.pointBuilder = pointBuilder;
        this.pipeManager = pipeManager;
    }


    @FXML
    private void openPipeFile() {
        pipesFile = fileChooser.showOpenDialog(new Stage());
        pipeFileLoaded = true;
        updateCalculateButton();

    }

    @FXML
    private void openPointsFile() {
        pointsFile = fileChooser.showOpenDialog(new Stage());
        pointsFileLoaded = true;
        updateCalculateButton();
    }

    @FXML
    private void calculate() {
        List<Pipe> pipes = pipeBuilder.build(pipesFile.getPath());
        List<Point> points = pointBuilder.build(pointsFile.getPath());

        pipes.forEach(pipeImplService::save);
        points.forEach(pointImplService::save);

        pipeManager.start(pipes, points);
        pipeManager.getAnswers().forEach(answer -> vBox.getChildren().add(new AnswerPane(answer)));


    }

    private void updateCalculateButton() {
        if (pointsFileLoaded && pipeFileLoaded) {
            calculateButton.setDisable(false);
        }
    }
}
