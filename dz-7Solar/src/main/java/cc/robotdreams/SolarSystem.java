package cc.robotdreams;

public enum SolarSystem2 {
    MERCURY(0, 2439),
    VENUS(51, 6051),
    EARTH(41, 6371),
    MARS(79, 3389),
    JUPITER(550, 69911),
    SATURN(652, 58232),
    URANUS(1441, 25362),
    NEPTUNE(1629, 24622);

    public static final int FROM_THE_SUN_TO_MERCURY = 57;
    private final int distanceFromCurrentToPrev;
    private final int radius;
    private int distanceFromTheSun;
    private SolarSystem2 nextPlanet;

    SolarSystem2(int distanceFromCurrentToPrev, int radius) {
        this.distanceFromCurrentToPrev = distanceFromCurrentToPrev;
        this.radius = radius;
    }

    static {
        SolarSystem2[] planets = SolarSystem2.values();
        for (int i = 0; i < planets.length; i++) {
            if (i == 0) {
                planets[i].distanceFromTheSun = FROM_THE_SUN_TO_MERCURY;
            } else {
                planets[i].distanceFromTheSun = planets[i - 1].distanceFromTheSun + planets[i].distanceFromCurrentToPrev;
            }

            if (i + 1 < planets.length) {
                planets[i].nextPlanet = planets[i + 1];
            } else {
                planets[i].nextPlanet = null;
            }
        }
    }

    public int getDistanceFromCurrentToPrev() {
        return distanceFromCurrentToPrev;
    }

    public int getRadius() {
        return radius;
    }

    public int getDistanceFromTheSun() {
        return distanceFromTheSun;
    }

    public SolarSystem2 getNextPlanet() {
        return nextPlanet;
    }
}
