package practica1_uf5_pablo;

import utils.Utils;
import java.util.Scanner;

public class Practica1_UF5_Pablo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sortir = false;

        do {
            int opcio = Utils.LlegirInt("Selecciona una opcio: ");

            switch (opcio) {
                case 1 -> {
                    divisio();
                }
                case 2 -> {
                    figura();
                }

                case 3 -> {
                    calculadora();
                }
                case 4 -> {
                    sortir = true;
                }

                default -> {
                    System.out.println("Opcio no valida");
                }

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
                System.out.println(e.getMessage());
            }

        }

    }

    public static void figura() {
        int costats;
        costats = Utils.LlegirInt("Quants costats vols: ");
        int[] longitud = new int[costats];
        for (int i = 0; i < longitud.length; i++) {
            longitud[i] = Utils.LlegirInt("Longitud del costat: ");
        }

        try {
            Figura figura = new Figura(costats, longitud);
            System.out.println("Longitud del perimetre: " + figura.perimetre());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void calculadora() {
        boolean sortir = false;
        String operacio;
        int operand1 = 0;
        int operand2 = 0;

        do {
            System.out.print("Quina operacio vols fer: ");
            operacio = input.next();

            if (operacio.equalsIgnoreCase("z")) {
                sortir = true;
                System.out.println("Fins aviat");
            } else {
                try {
                    operand1 = Utils.LlegirInt("Primer numero ");
                    operand2 = Utils.LlegirInt("Segon numero ");
                    try {
                        Calculadora calc = new Calculadora(operacio, operand1, operand2);
                        try {
                            if (operacio.equals("/")) {
                                System.out.println("Divisio: " + calc.divisio());
                            }

                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        if (operacio.equals("+")) {
                            System.out.println("Suma: " + calc.suma());
                        } else if (operacio.equals("-")) {
                            System.out.println("Resta: " + calc.resta());
                        } else if (operacio.equals("*")) {
                            System.out.println("Multiplicacio: " + calc.multiplicacio());
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El numero no es enter");
                }
            }
        } while (!sortir);

    }

}
