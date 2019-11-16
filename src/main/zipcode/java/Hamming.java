public class Hamming {
    String stringOne;
    String stringTwo;

    public Hamming(String s, String s1) {
        if(s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        stringOne = s;
        stringTwo = s1;
    }


    public int getHammingDistance() {
        int counter = 0;
        for(int i = 0;i < stringOne.length(); i++)
            if(stringOne.charAt(i) != stringTwo.charAt(i)){
                counter++;
            }


        return counter;
    }
}
