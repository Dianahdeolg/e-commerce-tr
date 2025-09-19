import java.util.Random;

public class CaptainsLog {

   
    private static final char[] PLANET_CLASSES = {'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    private final Random random;

    public CaptainsLog() {
        this.random = new Random();
    }

    public CaptainsLog(Random random) {
        this.random = random;
    }

    public char randomPlanetClass() {
        int index = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[index];
    }

    public String randomShipRegistryNumber() {
        int number = 1000 + random.nextInt(9000); // 1000 a 9999
        return "NCC-" + number;
    }

    public double randomStardate() {
        return 41000.0 + random.nextDouble() * (42000.0 - 41000.0);
    }
}
