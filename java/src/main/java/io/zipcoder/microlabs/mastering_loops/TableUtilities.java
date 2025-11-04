package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();

        for (int row = 1; row <= tableSize; row++) {
            for (int col = 1; col <= tableSize; col++) {
                int product = row * col;
                
                table.append(String.format("%3d |", product));
            }
            table.append("\n");
        }

        return table.toString();
    }

    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5); 
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10); 
    }
}