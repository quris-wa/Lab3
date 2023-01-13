public class Rocket extends Transport{
    private String name;
    private Material material;
    public Rocket(String name, Point point, Location location, Material material) {
        super (name, point, location, material);
        this.name = name;
        this.material = material;
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
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
        return ((Rocket) obj).getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return "Rocket: " + this.getName();
    }
}
