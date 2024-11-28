package com.example.exam.entity;

public class indexer {
    private int index_id;
    private String name;
    private int valueMin;
    private int valueMax;

    public indexer(int index_id, String name, int valueMin, int valueMax) {
        this.index_id = index_id;
        this.name = name;
        this.valueMin = valueMin;
        this.valueMax = valueMax;
    }

    public void setIndex_id(int index_id) {
        this.index_id = index_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValueMin(int valueMin) {
        this.valueMin = valueMin;
    }

    public void setValueMax(int valueMax) {
        this.valueMax = valueMax;
    }

    public int getIndex_id() {
        return index_id;
    }

    public String getName() {
        return name;
    }

    public int getValueMin() {
        return valueMin;
    }

    public int getValueMax() {
        return valueMax;
    }
}
