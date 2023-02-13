
package com.mycompany.calculadorajoption;

import javax.swing.JOptionPane;


public class CalculadoraJOption {

    public static void main(String[] args) {
        
        String x = JOptionPane.showInputDialog("Digite o primeiro valor");
        double numUm = Double.parseDouble(x);
        
        String y = JOptionPane.showInputDialog("Digite o segundo valor");
        double numDois = Double.parseDouble(y);
        
        String parcial = JOptionPane.showInputDialog("Selecione a operação desejada \n1- soma \n2- subtração \n3-divisão \n4-multiplicação");
        int operacao = Integer.parseInt(parcial);
        
        
        if(operacao==1)
                {
                    double resultado = numUm+numDois;
                    JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
        else if(operacao == 2)
                {
                    double resultado = numUm-numDois;
                    JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
        else if(operacao == 3)
                {
                    double resultado = numUm/numDois;
                    JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
        else if(operacao == 4)
                {
                    double resultado = numUm*numDois;
                    JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
        else{
            JOptionPane.showMessageDialog(null,"Numero Invalido","Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
     
    }
    
}
