/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class juego {
    private float num1;
    private float num2;
    private float intentos;
    
    public void validar (){
     num1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce un numero"));
     intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
     if (num1>0&&num1<50){
     this.num1=num1;
     
     }else{
     JOptionPane.showMessageDialog (null,"Introduce solo valores entre 1 y 50");
     }
    } 
    
    public void juego1(){
        for (float i=0;i<intentos; i++){
             num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if(num1==num2){
                JOptionPane.showMessageDialog(null,"Muy bien has acertado el numero "+num1);
                break;
            }else if (num1>num2){
                JOptionPane.showMessageDialog(null,"Prueba con un numero mayor");
              
            }else if (num1<num2){
                JOptionPane.showMessageDialog(null,"Prueba con un numero mas pequeño");
        }
    }
    }
}
     


