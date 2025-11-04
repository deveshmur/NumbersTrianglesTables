package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            row.append("*");
        }
        return row.toString();
    }

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= numberOfRows; i++) {
            triangle.append(getRow(i)).append("\n");
        }
        return triangle.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
