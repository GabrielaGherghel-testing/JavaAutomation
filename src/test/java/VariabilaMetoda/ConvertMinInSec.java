package VariabilaMetoda;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertMinInSec {

  // Variabila minute
  public int minutes;

  // Metoda setter pentru a seta valoarea minutelor
  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  // Calculăm secunde și afișăm rezultatul
  public void calcConvert() {
    // Calculul secundei
    int seconds = minutes * 60;

    // Tipărim rezultatul
    System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
  }

  @Test
  public void testConvert() {
    // Folosim setter pentru a seta valoarea de minute
    setMinutes(1);

    // Apelăm metoda pentru a face conversia și a afișa rezultatul
    calcConvert();

    // Verificăm rezultatul cu o aserțiune
    int expectedSeconds = 1 * 60;
    Assert.assertEquals(minutes * 60, expectedSeconds);

    // Tipărim și valoarea calculată a secundei pentru confirmare
    System.out.println("Calculated seconds for " + minutes + " minutes: " + expectedSeconds);
  }
}
