package practica1_uf5_pablo;

import utils.Utils;
import java.util.Scanner;

public class Practica1_UF5_Pablo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sortir = false;

        do {
            int opcio = Utils.LlegirInt("Selecciona una opcio");

            switch (opcio) {
                case 1: 
                    divisio();
                    break;                  
                case 2:

                case 3:

                default:
                    System.out.println("Opcio no valida");

            }

        } while (!sortir);
    }

    public static void divisio() {
        boolean sortir = false;
        int numa, numb, resultat;

        while (!sortir) {

            try {
                System.out.println("Introdueix el primer numero");
                numa = Integer.parseInt(input.next());
                System.out.println("Introdueix el segon numero");
                numb = Integer.parseInt(input.next());

                resultat = Exercici1.divisio(numa, numb);

                System.out.println("El resultat es " + resultat);
                sortir = true;

            } catch (NumberFormatException e) {
                System.out.println("Has d'introduir un numero enter valid");

            } catch (ArithmeticException e) {
                System.out.println("No es pot dividir entre 0");

            }

        }

    }

}
