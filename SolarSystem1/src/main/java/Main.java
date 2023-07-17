public class Main {
    public static void main(String[] args) {
        Planet mercury = Planet.MERCURY;
        System.out.println("Mercury: Order from Sun - " + mercury.getOrderFromSun() + ", Distance from previous planet - " +
                mercury.getDistanceFromPrevious() + ", Distance from Sun - " + mercury.getDistanceFromSun());

        Planet venus = Planet.VENUS;
        System.out.println("Venus: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());


        Planet venus = Planet.EARTH;
        System.out.println("Earth: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());

        Planet venus = Planet.MARS;
        System.out.println("Mars: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());

        Planet venus = Planet.JUPITER;
        System.out.println("Jupiter: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());

        Planet venus = Planet.SATURN;
        System.out.println("Saturn: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());

        Planet venus = Planet.URANUS;
        System.out.println("Uranus: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());

        Planet venus = Planet.NEPTUNE;
        System.out.println("Neptune: Order from Sun - " + venus.getOrderFromSun() + ", Distance from previous planet - " +
                venus.getDistanceFromPrevious() + ", Distance from Sun - " + venus.getDistanceFromSun());

    }
}

enum Planet {
    MERCURY(1, 0, 57.9),
    VENUS(2, 108, 108.2),
    EARTH(3, 150, 149.6),
    MARS(4, 228, 228.9),
    JUPITER(5, 777, 778.57),
    SATURN(6, 746, 1430),
    URANUS(7, 1916, 2871.0),
    NEPTUNE(8, 4498, 4500);

    private int orderFromSun;
    private int distanceFromPrevious;
    private double distanceFromSun;

    Planet(int orderFromSun, int distanceFromPrevious, double distanceFromSun) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = distanceFromSun;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
