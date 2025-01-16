package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //clasa=sablon care defineste proprietatile si comportamentul unei entitati specifice

   //intr-un fisier java putem avea mai multe claase diferentiate pe baza numelui(nu este un practice buna sa ai mai multe clase cu acelasi nume)

   //intr-o clasa putem defini proprietatile si actiunile entitatii

   //variabila=proprietatea unei clase

    //variabilile pot sa fie de 2 feluri: global si local

    //variabilele globale= sunt vizibile peste tot in proiect

    //variabilele locale= sunt vizibile doar in locul unde ai declarat

    //ca sa definim o variabila globala: accesscontrol (public) tip variabila nume variabila

    //in momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare

    //metoda = actiunea unei clase

    //exista 2 tipuri de metode: void si return

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;



    @Test
    public void prezentareStudent(){
        Nume="Gherghel";
        Prenume="Gabriela";
        Varsta=40;
        Adresa="Str Tudor Numarul 25";
        Inaltime=1.70;
        Greutate= 63.10F;
        Sex= 'F';
        AreDiploma= true;

    // System.out.println(Nume + " " + Prenume + " " + Varsta + " " + Adresa + " ");
    // System.out.println(Inaltime);
    // + lipeste concateneaza valorile
    // " " spatiu adaugat
    System.out.println("Numele studentului este:" + " "+ Nume);
        System.out.println("Prenumele studentului este:" + " " + Prenume);
        System.out.println("Varsta studentului este:" + " " + Varsta);
        System.out.println("Adresa studentului este:" + " " + Adresa);
        System.out.println("Inaltimea studentului este:" + " " + Inaltime);
        System.out.println("Greutatea studentului este:" + " " + Greutate);
        System.out.println("Sexul studentului este:" + " " + Sex);
        System.out.println("Are studentul diploma?" + " " + AreDiploma);
        calculMedie();

    }


    public void calculMedie(){
        Integer nota1= 8;
        Integer nota2= 9;
        Integer nota3= 10;
        Integer medie= (nota1+nota2+nota3)/3;
        System.out.println("Media Studentului este:" +" " +medie);



    };



}
