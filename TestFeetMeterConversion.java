/**
 * Name: Feet and Meter Conversion
 * Author: Leah Boalich
 * Date: August 25, 2024
 * Assignment: Module 1 Exercise 6.9
 * Description:  This program creates and displays a table that provies examples of
 * feet to meter conversions and meter to feet conversions.
 */

public class TestFeetMeterConversion {
     /** Main method */
    public static void main(String[] args) {
        double[][] conversionArray = fillConversionArray();
        printConversionTable(conversionArray);
    }

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        double feet = 3.279 * meter;
        return feet;
    }

    /** Fill conversion array */
    public static double[][] fillConversionArray() {
        double[][] conversionArray = new double[10][4];
        int i;
        double j = 20.0;
        for (i = 0; i < conversionArray.length; i++) {
            conversionArray[i][0] = i + 1.0;
            conversionArray[i][1] = footToMeter(i + 1.0);
            conversionArray[i][2] = j;
            conversionArray[i][3] = meterToFoot(j);
            j += 5.0;
        }
        return conversionArray;      
    }

    /** Print conversion table */
    public static void printConversionTable(double[][] array) {
        // Display the header of the table
        System.out.printf("\n%-10s%-10s%-5s%-10s%-10s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.print("- - - - - - - - - - - - - - - - - - - - - - \n");
        // Display the table data
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.printf("%-10.1f%-10.3f%-5s%-10.1f%-10.3f\n", array[i][0], array[i][1], "|", array[i][2], array[i][3]);                
        }
    }
 }
