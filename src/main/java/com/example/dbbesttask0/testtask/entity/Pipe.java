package com.example.dbbesttask0.testtask.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int start;
    private int end;
    private int length;

    public Pipe() {
    }

    public Pipe(int start, int end,int length) {
        this.start = start;
        this.end = end;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pipe{" +
                " start=" + start +
                ", end=" + end +
                ", length=" + length +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
