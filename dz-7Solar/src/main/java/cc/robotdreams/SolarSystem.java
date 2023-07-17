package cc.robotdreams;

public enum SolarSystem {
    MERCURY(0, 2439, null),
    VENUS(51, 6051, MERCURY),
    EARTH(41, 6371, VENUS),
    MARS(79, 3389, EARTH),
    JUPITER(550, 69911, MARS),
    SATURN(652, 58232, JUPITER),
    URANUS(1441, 25362, SATURN),
    NEPTUNE(1629, 24622, URANUS);

//    public static final int FROM_THE_SUN_TO_MERCURY = 57;
//    private final int prevDistance;
//    private final int radius;
//    private int distanceFromTheSun;
//    private SolarSystem nextPlanet;
//    private SolarSystem previousPlanet; // Added previousPlanet field
//
//    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
//        this.prevDistance = prevDistance;
//        this.radius = radius;
//        this.previousPlanet = previous;
//    }
//
//    static {
//        SolarSystem[] planets = SolarSystem.values();
//        for (int i = 0; i < planets.length; i++) {
//            if (i == 0) {
//                planets[i].distanceFromTheSun = FROM_THE_SUN_TO_MERCURY;
//            } else {
//                planets[i].distanceFromTheSun = planets[i - 1].distanceFromTheSun + planets[i].prevDistance;
//            }
//
//            if (i + 1 < planets.length) {
//                planets[i].nextPlanet = planets[i + 1];
//            } else {
//                planets[i].nextPlanet = null;
//            }
//        }
//    }
//
//    public int getPrevDistance() {
//        return prevDistance;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public int getDistanceFromTheSun() {
//        return distanceFromTheSun;
//    }
//
//    public SolarSystem getNextPlanet() {
//        return nextPlanet;
//    }
//
//    public SolarSystem getPreviousPlanet() { // Getter method for previousPlanet
//        return previousPlanet;
//    }
//}
