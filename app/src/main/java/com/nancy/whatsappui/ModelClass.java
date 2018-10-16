package com.nancy.whatsappui;

public class ModelClass {

    private String name;
    private String time;
    private String text;

    public ModelClass(String name, String time, String text) {
        this.name = name;
        this.time = time;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
