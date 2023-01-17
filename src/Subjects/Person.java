package Subjects;

import Abstracts.*;

public class Person implements canChangeLoc {
    private String name;
    private Location location;
    private Point point;
    private Thoughs thoughs = Thoughs.NEUTRAL;
    private IsSleeping isSleeping;
    public Person(String name, Location location, Point point, IsSleeping isSleeping) {
        this.name = name;
        this.location = location;
        this.point = point;
        this.isSleeping = isSleeping;
        this.joinToStory();
    }
    public String getName() {
        return name;
    }
    private void joinToStory() {
        System.out.println("Персонаж " + name + " присоединился");
    }

    public String getIsSleeping() {
        return isSleeping.toString();
    }
    @Override
    public void setLocation(Location location) {
        this.location = location;
        if(point.getX() == 0 && point.getY() == 0)System.out.println("Персонаж " + name + " находится в локации " + location.getLocationName() + " его координаты " + point.getX() + "," + point.getY());
    }
    public void go(Location location) {
        point.sumX(10);
        setLocation(location);
        if(location.getLocationName().equals("Круглая площадь")){
            System.out.println("Персонаж " + name + " прокрадывается в локацию " + location.getLocationName() + " его координаты " + point.getX()+ "," + point.getY());
        }
        else {
            System.out.println("Персонаж " + name + " идет в локацию " + location.getLocationName() + " его координаты " + point.getX()+ "," + point.getY());
        }
    }

    public void scare() {
        if(name.equals("Пончик") && location.getLocationName().equals("Дорога")){
            thoughs = Thoughs.SCAREDOFSCAPE;
            System.out.println(name + " боялся уноситься в космическое пространство ");
        }
    }

    public void regret() {
        if(name.equals("Пончик") && thoughs.equals(Thoughs.SCAREDOFSCAPE)){
            thoughs = Thoughs.REGRET;
            System.out.println(name + " уже расскаивался, что пошел с Незнайкой ");
        }
    }

    public void shame() {
        if(name.equals("Пончик") && thoughs.equals(Thoughs.REGRET)){
            thoughs = Thoughs.SHAME;
            System.out.println(name + " стыдился признать, что струсил ");
        }
    }
    public void notSleep(){
        if(getIsSleeping().equals("NOTSLEEPING")){
            System.out.println(name + " не лег спать");
        }
    }
    public void think(Thoughs thoughs){
        if(thoughs.equals(Thoughs.AMAZED)){
            System.out.println("Персонажу " + name + " кажется, что ракета светится сама собой");
        }

        if(thoughs.equals(Thoughs.ROCKETWILLFLY)){
            System.out.println("Персонажу " + name + " кажется, что ракета вот-вот взлетит ввысь");
        }

    }



    public Point getPoint() {
        return point;
    }


    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Hero: " + name;
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        return (result * 41);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Person) obj).name.equals(name);
    }
}
