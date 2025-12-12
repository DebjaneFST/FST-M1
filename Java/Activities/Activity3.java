package activities;
public class Activity3 {

    public static void main(String[] args) {

        // Given seconds
        double seconds = 1000000000;

        // Orbital periods in Earth years
        double earthSeconds   = 31557600;        // 1 Earth year in seconds
        double mercurySeconds = earthSeconds * 0.2408467;
        double venusSeconds   = earthSeconds * 0.61519726;
        double marsSeconds    = earthSeconds * 1.8808158;
        double jupiterSeconds = earthSeconds * 11.862615;
        double saturnSeconds  = earthSeconds * 29.447498;
        double uranusSeconds  = earthSeconds * 84.016846;
        double neptuneSeconds = earthSeconds * 164.79132;

        // Calculating ages
        double ageEarth   = seconds / earthSeconds;
        double ageMercury = seconds / mercurySeconds;
        double ageVenus   = seconds / venusSeconds;
        double ageMars    = seconds / marsSeconds;
        double ageJupiter = seconds / jupiterSeconds;
        double ageSaturn  = seconds / saturnSeconds;
        double ageUranus  = seconds / uranusSeconds;
        double ageNeptune = seconds / neptuneSeconds;

        // Printing results
        System.out.println("Age on Earth:   " + ageEarth);
        System.out.println("Age on Mercury: " + ageMercury);
        System.out.println("Age on Venus:   " + ageVenus);
        System.out.println("Age on Mars:    " + ageMars);
        System.out.println("Age on Jupiter: " + ageJupiter);
        System.out.println("Age on Saturn:  " + ageSaturn);
        System.out.println("Age on Uranus:  " + ageUranus);
        System.out.println("Age on Neptune: " + ageNeptune);
    }
}
