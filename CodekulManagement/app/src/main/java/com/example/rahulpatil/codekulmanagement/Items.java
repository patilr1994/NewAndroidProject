package com.example.rahulpatil.codekulmanagement;

/**
 * Created by Rahul Patil on 12-Apr-17
 */

public class Items {

private String batch;
    private String startdate;
    private String time;



    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public Items(String batch, String startdate, String time) {
        this.batch = batch;
        this.startdate = startdate;
        this.time = time;
    }

    public String getBatch() {
        return batch;
    }

    public String getStartdate() {
        return startdate;
    }



    public String getTime() {
        return time;
    }
    @Override
    public String toString() {
        return "Enquiry{" + "Batch='" + batch + '\'' + " startdate='" + startdate + '\'' + "time='"+time+'}';
    }
}
