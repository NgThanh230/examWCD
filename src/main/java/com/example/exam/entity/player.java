package com.example.exam.entity;

public class player {
    public int playerid;
    public String name;
    public int age;
    public int indexid;

    public player(int playerid, int indexid, int age, String name) {
        this.playerid = playerid;
        this.indexid = indexid;
        this.age = age;
        this.name = name;
    }

    public int getPlayerid() {
        return playerid;
    }

    public int getIndexid() {
        return indexid;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public void setIndexid(int indexid) {
        this.indexid = indexid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
