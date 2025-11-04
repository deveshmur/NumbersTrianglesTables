package io.zipcoder.microlabs.mastering_loops;

public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += (int) Math.pow(i, exponent);
        }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

  

    public static boolean isNumberEven(int toTest) { 
        return toTest % 2 == 0; 
    }

    public static boolean isNumberOdd(int toTest) { 
        return toTest % 2 != 0; 
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (isNumberEven(i)) {
                result += i;
            }
        }
        return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (isNumberOdd(i)) {
                result += i;
            }
        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += (i * i);
        }
        return result;
    }
}
