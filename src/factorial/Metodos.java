/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Diego
 */
public class Metodos {
    
    private int calculos(){    
        int numeroCalc = 1;
        for (int multiplicador = 8; multiplicador >= 1; multiplicador--){
            numeroCalc = numeroCalc * multiplicador;
        }
        return numeroCalc;
    }
    
    public void mostrar(){
        System.out.println(calculos());
    }
}
