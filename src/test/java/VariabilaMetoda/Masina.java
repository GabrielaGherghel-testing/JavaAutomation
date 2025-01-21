package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Masina {
  public String marca;

  public String model;

  public Integer anfabricatie;

  @Test
  public void metodaTest() {
    dateMasina("Audi", "Q10", 2007);
    dateMasina("BVM", "X10", 2008);

    calculMedia(7.0, 8.0);
    calculMedia(3.0, 8.0);
    citireNote();
  }

  public void dateMasina(String param1, String param2, Integer param3) {
    marca = param1;
    model = param2;
    anfabricatie = param3;

    System.out.println("Marca masinii este " + marca);
    System.out.println("Modelul masinii este " + model);
    System.out.println("Anul de fabricatie este " + anfabricatie);
  }

  // calculam media la 2 numere

  public void calculMedia(Double nota1, Double nota2) {

    Double rezultat = (nota1 + nota2) / 2;
    System.out.println("Media celor 2 note este: " + rezultat);
  }

  public void citireNote() {

    Scanner scanner = new Scanner(System.in);
    int nota = scanner.nextInt();
    while (nota < 0 || nota > 10) {
      System.out.println(
          "Nota " + nota + "trebuie intre 1 si 10. Te rog introdu o valoare valida.");
      nota = scanner.nextInt();
    }
    System.out.println("Nota" + nota + " este intre 1 si 10.");
  }
}
