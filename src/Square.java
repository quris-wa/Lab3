public class Square extends Location {
    private int length;
    public Square(String name, int length, Time time) {
        super(name, time);
        this.length = length;
    }
    @Override
    public String getLocationName() {
        return super.getLocationName();
    }

    @Override
    public int hashCode() {
        int result = this.getLocationName() == null ? 0 : this.getLocationName().hashCode();
        return (result) * 60;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Square) obj).getLocationName().equals(this.getLocationName());
    }

    @Override
    public String toString() {
        return "Square: " + this.getLocationName();
    }
}