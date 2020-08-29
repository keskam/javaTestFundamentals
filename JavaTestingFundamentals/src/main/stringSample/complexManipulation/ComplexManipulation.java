package stringSample.complexManipulation;

import java.util.Random;

public class ComplexManipulation {

    private String[] stringArray = {"one", "two", "three", "four", "five", "six"};
    private Random random = new Random();

    public String getSubstring(String word, int position) {
        return word.substring(position);
    }

    public boolean checkIfContains(String word, String wordToCheck) {
        return word.contains(wordToCheck);
    }

    public String returnRandom() {
        int randomNumber = random.nextInt(stringArray.length);
        return stringArray[randomNumber];
    }
}
