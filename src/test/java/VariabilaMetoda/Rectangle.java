package VariabilaMetoda;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rectangle {

    // Metoda pentru calcularea perimetrului dreptunghiului
    public int calculateRectanglePerimeter(int customWidth, int customLength) {
        int perimeter = 2 * (customWidth + customLength); // Formula perimetrului
        return perimeter;  // Returnează perimetrul calculat
    }

    // Metoda pentru a tipări perimetrul
    public void printPerimeter(int customWidth, int customLength) {
        // Calculăm perimetrul
        int perimeter = calculateRectanglePerimeter(customWidth, customLength);

        // Tipărim perimetrul
        System.out.println("The perimeter of the rectangle with width " + customWidth + " and length " + customLength + " is: " + perimeter);
    }

    // Testul care validează calculul perimetrului
    @Test
    public void testPerimeterCalculator() {
        // Verificăm dacă metoda de calcul funcționează corect
        Assert.assertEquals(calculateRectanglePerimeter(8, 4), 24);  // Test pentru un dreptunghi cu lățimea 8 și lungimea 4
        Assert.assertEquals(calculateRectanglePerimeter(3, 4), 14);  // Test pentru un dreptunghi cu lățimea 3 și lungimea 4
    }

    @Test
    // Metoda principală pentru testare și afișare
    public static void main(String[] args) {
        // Creăm un obiect Rectangle
        Rectangle calc = new Rectangle();

        // Testăm și tipărim perimetrul pentru un dreptunghi cu lățimea 8 și lungimea 4
        calc.printPerimeter(8, 4);

        // Testăm și tipărim perimetrul pentru un dreptunghi cu lățimea 3 și lungimea 4
        calc.printPerimeter(3, 4);
    }
}
