/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author ANGELO
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result=0;
        int A;
        int B;
        String opera;
        A=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor"));
        opera=(JOptionPane.showInputDialog(null,"Informa a operação"));
        B=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor"));
        if(opera.equals("+")){
            result=A+B;
        }
        if(opera.equals("-")){
            result=A-B;
        }
        if(opera.equals("/")){
            result=A/B;
        }
        else{
            if(opera.equals("x") || opera.equals("*") || opera.equals(".")){
            result=A*B;
        }
    }
        JOptionPane.showMessageDialog(null,"Sua resposta \n" + result);
    }
    
}
