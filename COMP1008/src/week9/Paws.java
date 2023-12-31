package week9;

public interface Paws {
    int MAX_COUNT = 4;

    /**
     * Output the size of a hole dug
     * @param durationInSeconds time the animal digs
     * @return depth of the hole
     */
    public double dig(int durationInSeconds);
    boolean strike(String target);
    int scratch(String location);
}
