package SOO3.Clases;

import java.sql.Time;

public class ClassTime {
    private int hour;
    private int minute;
    private int second;
    public ClassTime (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString (){
        return hour + "/" + minute + "/" + second;
    }

    public Time nextSecond(){
        this.second = second + 1;
        return second;
    }

    public Time previousSecond(){
        return second;
    }
}
