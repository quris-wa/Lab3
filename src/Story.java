public class Story {
    public static void main(String[] args) {
        Location home = new Home("Дом", 0, Time.NIGHT);
        Location road = new Road("Дорога",10, Time.NIGHT);
        Location cosmiccity = new CosmicCity("Космический городок", 20, Time.NIGHT);
        Location square =  new Square("Круглая площадь", 30, Time.NIGHT);
        Person neznayka = new Person("Незнайка", home, new Point(0), IsSleeping.NOTSLEEPING);
        Person ponchik = new Person("Пончик", home, new Point(0), IsSleeping.NOTSLEEPING);
        OtherGuys korotyshki = new OtherGuys("Остальные коротышки", IsSleeping.NOTSLEEPING);
        neznayka.setLocation(home);
        ponchik.setLocation(home);
        neznayka.notSleep();
        ponchik.notSleep();
        korotyshki.toSleep();
        neznayka.go(road);
        ponchik.go(road);
        ponchik.scare();
        ponchik.regret();
        ponchik.shame();
        neznayka.go(cosmiccity);
        ponchik.go(cosmiccity);
        CelestialBody moon = new Moon("Луна");
        moon.toShine();
        neznayka.go(square);
        ponchik.go(square);
        Transport rocket = new Rocket("Ракета", new Point(0), square, Material.METAL);
        rocket.toShineR();
        neznayka.think(Thoughs.AMAZED);
        ponchik.think(Thoughs.AMAZED);
        rocket.beBrave();
        neznayka.think(Thoughs.ROCKETWILLFLY);
        ponchik.think(Thoughs.ROCKETWILLFLY);
    }
}
