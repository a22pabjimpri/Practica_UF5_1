/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_uf5_pablo;

/**
 *
 * @author Pablo Jiménez
 */
public class Calculadora {

    String operacio;
    int operand1;
    int operand2;

    public Calculadora(String operacio, int operand1, int operand2) throws Exception {
        if (!operacio.equals("+") && !operacio.equals("-") && !operacio.equals("/") && !operacio.equals("*") && !operacio.equalsIgnoreCase("z")) {
            throw new Exception("Operacio no valida");
        }
        this.operacio = operacio;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int suma() {
        return operand1 + operand2;

    }

    public int resta() {
        return operand1 - operand2;
    }

    public int multiplicacio() {
        return operand1 * operand2;
    }

    public int divisio() throws ArithmeticException {
        if (operand1 == 0 || operand2 == 0) {
            throw new ArithmeticException("No es pot dividir entre 0");
        }
        return operand1 / operand2;
    }

}
