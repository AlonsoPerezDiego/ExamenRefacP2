/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Metodos {
    
    private int calculos(){
        //Método donde se realizan los cálculos.
        int repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de repeticiones y mira el resultado en la consola."));
        int numeroCalc = 1;
        for (int multiplicador = repeticiones; multiplicador >= 1; multiplicador--){
            numeroCalc = numeroCalc * multiplicador;
        }
        return numeroCalc;
    }
    
    public void mostrar(){
        //Método mostrar.
        System.out.println(calculos());
    }
}
