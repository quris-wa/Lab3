package Abstracts;

public abstract class Location {
    private String name;
    private Time time;
    private Point point;
    public Location(String name, Time time, Point point) {
        this.name = name;
        this.time = time;
        this.point = point;
    }
    public String getTime(){
        return time.toString();
    }
    public String getLocationName() {
        return name;
    }
    public Point getPoint(){
        return point;
    }
    public Location() {}
}
