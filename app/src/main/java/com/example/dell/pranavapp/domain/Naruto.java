package com.example.dell.pranavapp.domain;

public class Naruto {

    private String heading;
    private String detail;
    private String time;

//    public Naruto(){
//
//    }

    public Naruto(String heading, String detail, String time) {
        this.heading = heading;
        this.detail = detail;
        this.time = time;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
