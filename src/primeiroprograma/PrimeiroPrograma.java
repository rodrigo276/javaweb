/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class PrimeiroPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu primeiro numero: " ));
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu segundo numero: "));
        
       int resultado = numero   * numero1;
               System.out.println("rodrigo");
               System.out.println("agora sim");
               
               
               
               
               
        

        JOptionPane.showMessageDialog(null, "seu resultsdo é: " + resultado);
       
    }
}
