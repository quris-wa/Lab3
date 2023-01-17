package Subjects;

import Abstracts.Location;
import Abstracts.Point;
import Abstracts.Time;

public class Road extends Location {
    private int length;
    public Road(String name, int length, Time time, Point point) {
        super(name, time, point);
        this.length = length;
    }
    @Override
    public String getLocationName() {
        return super.getLocationName();
    }

    @Override
    public int hashCode() {
        int result = this.getLocationName() == null ? 0 : this.getLocationName().hashCode();
        return (result) * 20;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Road) obj).getLocationName().equals(this.getLocationName());
    }

    @Override
    public String toString() {
        return "Subjects.Road: " + this.getLocationName();
    }
}
