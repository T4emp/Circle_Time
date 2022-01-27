package com.xwx;

public class Time{
    private int second, minute, hour;

    public Time(int second, int minute, int hour){
        if(second <= 60 && minute <= 60 && hour <= 24){
            this.second = second;
            this.minute = minute;
            this.hour = hour;
            System.out.println(Time.this);
        }
        else{
            System.out.println("Ошибка!");
        }
    }

    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
        System.out.println(Time.this);
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int second, int minute, int hour){
        if(second <= 60 && minute <= 60 && hour <= 24){
            this.second = second;
            this.minute = minute;
            this.hour = hour;
            System.out.println(Time.this);
        }
        else{
            System.out.println("Ошибка!");
        }
    }

    public Time nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
}
