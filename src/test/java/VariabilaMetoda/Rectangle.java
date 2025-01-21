package VariabilaMetoda;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rectangle {

    // Method to calculate the perimeter of a rectangle
    public int calculateRectanglePerimeter(int customWidth, int customLength) {
        // Validate dimensions (width and length must be positive)
        if (customWidth <= 0 || customLength <= 0) {
            throw new IllegalArgumentException("Width and length must be positive integers.");
        }

        // Validate that length is greater than width
        if (customLength <= customWidth) {
            throw new IllegalArgumentException("Length must be greater than width for a valid rectangle.");
        }

        // Calculate perimeter
        int perimeter = 2 * (customWidth + customLength);
        return perimeter;
    }

    // Method to print the perimeter
    public void printPerimeter(int customWidth, int customLength) {
        // Calculate perimeter
        int perimeter = calculateRectanglePerimeter(customWidth, customLength);

        // Print the perimeter
        System.out.println("The perimeter of the rectangle with width " + customWidth + " and length " + customLength + " is: " + perimeter);
    }

    // Test method for invalid dimensions (negative, zero, width > length)
    @Test
    public void testInvalidDimensions() {
        try {
            // Test for negative values
            System.out.println("Testing with width -5 and length 4");
            calculateRectanglePerimeter(-5, 4);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Testing with width 5 and length -4");
            calculateRectanglePerimeter(5, -4);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Testing with width -5 and length -4");
            calculateRectanglePerimeter(-5, -4); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test for zero values
        try {
            System.out.println("Testing with width 0 and length 4");
            calculateRectanglePerimeter(0, 4);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Testing with width 5 and length 0");
            calculateRectanglePerimeter(5, 0);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test for width greater than length
        try {
            System.out.println("Testing with width 8 and length 4");
            calculateRectanglePerimeter(8, 4);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Testing with width 10 and length 5");
            calculateRectanglePerimeter(10, 5); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test for width equal to length
        try {
            System.out.println("Testing with width 5 and length 5");
            calculateRectanglePerimeter(5, 5);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test for non-integer values (e.g., floats/doubles)
        try {
            System.out.println("Testing with width 5.5 and length 7");
            calculateRectanglePerimeter((int) 5.5, 7);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Testing with width 5 and length 7.5");
            calculateRectanglePerimeter(5, (int) 7.5);  // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle calc = new Rectangle();

        // Test and print perimeter for a valid rectangle with width 8 and length 10
        calc.printPerimeter(8, 10);

        // Test and print perimeter for a valid rectangle with width 3 and length 5
        calc.printPerimeter(3, 5);

        // Test and print perimeter for a valid rectangle with width 5 and length 7
        calc.printPerimeter(5, 7);
    }
}
