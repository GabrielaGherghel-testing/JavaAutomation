package VariabilaMetoda;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareArea {

  // Method to calculate the area of a square
  public int calculateSquareArea(int side) {
    // Validate that the side is positive
    if (side <= 0) {
      throw new IllegalArgumentException("Side length must be a positive integer.");
    }

    // Area of square is side^2
    return side * side;
  }

  // Method to print the area of a square
  public void printSquareArea(int side) {
    try {
      int area = calculateSquareArea(side);
      System.out.println("The area of a square with side length " + side + " is: " + area);
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  // Check if the side is equal to a specific value (e.g., 5)
  public void checkSideValue(int side, int expectedValue) {
    if (side == expectedValue) {
      System.out.println("The side length is equal to the expected value: " + expectedValue);
    } else {
      System.out.println(
          "The side length is not equal to the expected value. Given side: "
              + side
              + ", Expected: "
              + expectedValue);
    }
  }

  // Test method to handle invalid cases and print messages for each case
  @Test
  public void testInvalidDimensions() {
    System.out.println("\n--- Running Test: testInvalidDimensions ---");

    // Test with invalid side length (negative value)
    System.out.println("Testing with side length -5:");
    try {
      printSquareArea(-5); // Should throw an exception
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Test with invalid side length (zero value)
    System.out.println("\nTesting with side length 0:");
    try {
      printSquareArea(0); // Should throw an exception
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Test with a valid side length
    System.out.println("\nTesting with side length 5:");
    printSquareArea(5); // Should print the area

    // Check if side is equal to the expected value
    System.out.println("\nChecking if side is equal to 5:");
    checkSideValue(5, 5); // Should print: side is equal to 5

    // Check if side is not equal to the expected value
    System.out.println("\nChecking if side is equal to 5 (with side 3):");
    checkSideValue(3, 5); // Should print: side is not equal to 5
  }

  // Test for valid square area calculation
  @Test
  public void testValidSquareArea() {
    System.out.println("\n--- Running Test: testValidSquareArea ---");

    int side = 4;
    int expectedArea = 16;

    System.out.println("Testing with side length " + side + ":");

    int actualArea = calculateSquareArea(side);
    Assert.assertEquals(actualArea, expectedArea, "The area should be 16 for side 4.");
    System.out.println("The calculated area for side " + side + " is: " + actualArea);
  }

  public static void main(String[] args) {
    // Create an instance of SquareArea
    SquareArea square = new SquareArea();

    // Running the tests (TestNG will automatically run the tests via @Test)
    square.testInvalidDimensions();
    square.testValidSquareArea();
  }
}
