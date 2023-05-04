/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_uf5_pablo;

/**
 *
 * @author ausias
 */
public class Exercici1 {
    public static int divisio(int numa, int numb)throws ArithmeticException{
        if(numa == 0 || numb == 0){
            throw new ArithmeticException("No es pot dividir entre 0");
        }
        return numa/numb;
    }
    
}
