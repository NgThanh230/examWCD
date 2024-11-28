package com.example.exam.entity;

public class playerindex {
    public int id;
    public int playerid;
    public int indexid;

    public playerindex(int id, int playerid, int indexid, float value) {
        this.id = id;
        this.playerid = playerid;
        this.indexid = indexid;
        this.value = value;
    }

    public playerindex() {

    }

    public float getValue() {
        return value;
    }

    public int getPlayerid() {
        return playerid;
    }

    public int getIndexid() {
        return indexid;
    }

    public int getId() {
        return id;
    }

    public float value;

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setIndexid(int indexid) {
        this.indexid = indexid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }
}
