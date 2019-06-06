package com.programming.chapter3.program;

public enum Color {
    RED("red","blood"),GREEN("green","flower"),BLUE("blue","sky");

    private String color;
    private String desc;

    Color(String color, String desc) {
        this.color = color;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
