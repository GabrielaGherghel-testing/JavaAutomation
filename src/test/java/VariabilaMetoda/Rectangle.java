package VariabilaMetoda;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rectangle {

  @Test
public void calculRectangle() {
    Integer length = 4;
    Integer width = 8;
    Integer perimeter = 2 * (length + width);
  System.out.println("The perimeter of the rectangle is: " + perimeter);
  }
}
