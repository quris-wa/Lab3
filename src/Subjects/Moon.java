package Subjects;

import Abstracts.CelestialBody;

public class Moon extends CelestialBody {
    private String name;
    public Moon(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String toString() {
        return "Subjects.Moon: " + this.getName();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Moon) obj).name.equals(name);
    }
}
