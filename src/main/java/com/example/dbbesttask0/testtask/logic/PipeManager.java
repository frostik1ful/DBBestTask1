package com.example.dbbesttask0.testtask.logic;

import com.example.dbbesttask0.testtask.entity.Pipe;
import com.example.dbbesttask0.testtask.entity.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PipeManager {
    private List<Pipe> pipes;
    private List<Answer> answers;


    public void start(List<Pipe> pipes, List<Point> points) {
        this.pipes = pipes;
        answers = new ArrayList<>(Collections.nCopies(points.size(), new Answer(false, 0)));
        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            List<Pipe> pipesWithSameStart = this.pipes.stream().filter(pipe -> pipe.getStart() == point.getStart()).collect(Collectors.toList());
            for (Pipe pipe : pipesWithSameStart) {
                findPath(pipe, point.getEnd(), i, 0);
            }
        }
    }

    private void findPath(Pipe pipe, int finish, int answerIndex, int length) {
        if (pipe.getEnd() == finish) {
            int finalLength = length + pipe.getLength();
            if (!answers.get(answerIndex).isWayFound() || answers.get(answerIndex).getLength() > finalLength) {
                answers.set(answerIndex, new Answer(true, finalLength));
            }
        } else {
            List<Pipe> connectedPipes = this.pipes.stream().filter(pipe1 -> pipe1.getStart() == pipe.getEnd()).collect(Collectors.toList());
            if (connectedPipes.size() > 0) {
                connectedPipes.forEach(pipe1 -> findPath(pipe1, finish, answerIndex, length + pipe.getLength()));
            }
        }


    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
