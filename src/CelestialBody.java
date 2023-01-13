public abstract class CelestialBody {
    private String name;
    public CelestialBody(String name) {
        this.name = name;
        joinToStory();
    }
    public CelestialBody() {}
    public void toShine(){
        if(getName().equals("Луна")){
            System.out.println(name + " взошла и стало светлее");
        }
    }
    public String getName() {
        return name;
    }
    private void joinToStory() {
        System.out.println("Космическое тело " + name + " появилось в истории");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((CelestialBody) obj).name.equals(name);
    }
}
