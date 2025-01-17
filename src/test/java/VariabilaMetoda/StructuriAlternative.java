package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

  // Structuri alternative=if-then-else; switch-case

  @Test
  public void metodaTest() {
    metodaVerificareNmuar(7);
    metodaVerificareNmuar(3);
    metodaVerificareNmuar(5);
    metodaVerificareNumarParPozitiv(4);
    metodaVerificareNumarParPozitiv(1);
    metodaVerificareNumarParPozitiv(-1);
    metodaVerificareNumarParPozitiv(-9);
    metodaVerificareNumarParPozitiv(0);
    metodaVerificareNumarParPozitiv(-2);
  }

  // verificam un numar mai mare decat 5
  public void metodaVerificareNmuar(int Valoare) {
    if (Valoare > 5) {
      System.out.println("numarul " + Valoare + " este mai mare decat 5");
    } else if (Valoare < 5) {
      System.out.println("numarul " + Valoare + " este mai mic decat 5");
    } else {
      System.out.println("numarul " + Valoare + " este egal cu 5");
    }
  }

  // verificam daca un numar e par pozitiv sau negativ

  public void metodaVerificareNumarParPozitiv(int Valoare) {
    if (Valoare > 0) {
      if (Valoare % 2 == 0) {
        System.out.println("numarul " + Valoare + " este par pozitiv");
      } else {
        System.out.println("numarul " + Valoare + " este impar pozitiv");
      }
    }
    else if (Valoare < 0) {
      if (Valoare % 2 == 0) {
        System.out.println("numarul " + Valoare + " este par negativ");
      } else {
        System.out.println("numarul " + Valoare + " este impar negativ");
      }
    }
    else if (Valoare==0) {
      System.out.println("numarul " + Valoare + " este 0");
    }
  }
}
