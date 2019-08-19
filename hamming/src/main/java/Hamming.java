import java.util.stream.IntStream; 

class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() != rightStrand.length()) {
            String message = "leftStrand and rightStrand must be of equal length.";
            if (leftStrand.isEmpty()) {
                message = "left strand must not be empty.";
            } else if (rightStrand.isEmpty()) {
                message = "right strand must not be empty.";
            }
            throw new IllegalArgumentException(message);
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        return (int)IntStream.range(0, leftStrand.length())
                             .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                             .count();
    }

}
