package com.workintech.fswebs17d1.entity;

public class Animal {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
