/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_uf5_pablo;

/**
 *
 * @author ausias
 */
public class Figura {

    int costats;
    int [] longitud;
    
    public Figura(int costats, int... longitud)throws Exception {
        if(costats < 3 || costats!=longitud.length){
            throw new Exception("Nombre de costats no vàlid");
        }       
        this.costats = costats;
        this.longitud = longitud;
    }
    
    public int perimetre(){
        int perimetre = 0;
        
        for (int i = 0; i < longitud.length; i++) {
            perimetre += longitud[i];
        }
        return perimetre;
    }
    
}
