package stringSample;

import stringSample.complexManipulation.ComplexManipulation;

public class StringManipulation {

    public static String constant = "CONSTANT";
    public ComplexManipulation complexManipulation = new ComplexManipulation();
    private String someString = "someString";

    public static String getConstant() {
        return constant;
    }

    private String getSomeString() {
        return someString;
    }

    public String concatenate(String first, String second) {
        return first + second;
    }

    public char getFirstChart(String word) {
        return word.charAt(0);
    }

    public int getLength(String word) {
        return word.length();
    }

    public void toUpperCase(String word) {
        System.out.println(word.toUpperCase());
    }

    public void toLowerCase(String word) {
        System.out.println(word.toLowerCase());
    }

    public String trimString(String word) {
        return word.trim();
    }

    public boolean contains(String word, String wordToCheck) {
        return complexManipulation.checkIfContains(word, wordToCheck);
    }

    public String getSubstring(String word, int position) {
        return complexManipulation.getSubstring(word, position);
    }

    public String returnString() {
        return complexManipulation.returnRandom();
    }
}
