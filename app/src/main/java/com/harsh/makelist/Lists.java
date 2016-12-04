package com.harsh.makelist;

/**
 * Created by Harsh on 12/4/2016.
 */
public class Lists {

    private String title, time, status;

    public Lists() {}

    public Lists(String title, String time, String status) {
        this.title = title;
        this.time = time;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
