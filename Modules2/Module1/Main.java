package Module1;

public class Main {
    public static void main(String[] args){
        Planet mars = new Planet("Great", Planet.PlanetType.HOT);
        Planet mars2 = new Planet("Great", Planet.PlanetType.HOT);
        Planet neptune = new Planet("testing", Planet.PlanetType.COLD);
        Object test = new Object();

        System.out.println(mars.equals(mars2));
        System.out.println(mars.equals(neptune));
        System.out.println(mars.hashCode());
        System.out.println(neptune.hashCode());
    }
}
