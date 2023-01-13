public abstract class Location {
    private String name;
    private Time time;
    public Location(String name, Time time) {
        this.name = name;
        this.time = time;
    }
    public String getTime(){
        return time.toString();
    }
    public String getLocationName() {
        return name;
    }
    public Location() {}
}
