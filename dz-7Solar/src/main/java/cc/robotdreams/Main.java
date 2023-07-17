package cc.robotdreams;

public class Main {
    public static void main(String[] args) {
        SolarSystem[] planets = SolarSystem.values(); // all planets array

        for (int i = 0; i < planets.length; i++) {
            SolarSystem planet = planets[i];
            int ordinalNumber = i + 1; // Calculate the ordinal number

            System.out.println("Ordinal number: " + ordinalNumber);
            System.out.println("Distance from Sun: " + planet.getDistanceFromTheSun() + " for planet: " + planet.name());
            System.out.println("Radius: " + planet.getRadius());

            if (i > 0) {
                SolarSystem previousPlanet = planets[i - 1];
                System.out.println("Previous planet: " + previousPlanet.name());
            } else {
                System.out.println("Previous planet: None"); // If there is no previous planet (first planet in the enum)
            }

            SolarSystem nextPlanet = planet.getNextPlanet();
            if (nextPlanet != null) {
                System.out.println("Next planet: " + nextPlanet.name());
            } else {
                System.out.println("Next planet: None"); // If there is no next planet (last planet in the enum)
            }

            System.out.println(); // Add an empty line for better readability
        }
    }
}
