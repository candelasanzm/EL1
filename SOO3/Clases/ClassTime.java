package SOO3.Clases;

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
        if (0 <= hour && hour <= 23){
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59){
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 59){
            this.second = second;
        }
    }

    public void setTime (int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString (){
        return hour + ":" + minute + ":" + second;
    }

    public ClassTime nextSecond(){
        this.second ++;
        if (this.second > 59){
            this.second = 0;
        }
        return this;
    }

    public ClassTime previousSecond(){
        this.second --;
        if (this.second < 0){
            this.second = 59;
        }
        return this;
    }
}
