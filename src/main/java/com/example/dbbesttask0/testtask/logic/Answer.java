package com.example.dbbesttask0.testtask.logic;

public class Answer {
    private boolean isWayFound;
    private int length;

    public Answer(boolean isWayFound, int length) {
        this.isWayFound = isWayFound;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "isWayFound=" + isWayFound +
                ", length=" + length +
                '}';
    }

    public boolean isWayFound() {
        return isWayFound;
    }

    public void setWayFound(boolean wayFound) {
        isWayFound = wayFound;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
