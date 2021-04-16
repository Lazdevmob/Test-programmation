package com.OCR.Laz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("indiquer la date mini");
        int jourmini = sc.nextInt();
        System.out.println("indiquer la date maxi");
        int jourmaxi = sc.nextInt();
        System.out.println("indiquer le nb de personne");
        int npersonne = sc.nextInt();
        int espionPossible = 0;
        int personne = 1;

        for (int loop = 1; loop <= npersonne; loop = loop + 1) {
            System.out.println("indiquer le jour darrivee de la personne " + personne);
            int jourEntreeEspion = sc.nextInt();

            personne = personne + 1;


            if ((jourmini <= jourEntreeEspion) && (jourEntreeEspion <= jourmaxi)) {
                espionPossible = espionPossible + 1;
            }
        }
        System.out.print("le nb de cas possible est " + espionPossible);
    }
}




