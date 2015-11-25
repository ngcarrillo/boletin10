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
    private float diferencia;
    private String modo;
    private String novoIntento;
    
    
    public void modoJuego(){
        boolean volverEmpezar;
    do{ 
        
        modo = JOptionPane.showInputDialog("Quieres jugar solo o con un amigo");
    
        switch (modo){
        case "solo":
            num1 =(int)(Math.random()* 50 +1);
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
            juego1();
            volverJugar();
            break;
        case "amigo":
            validar();
            juego1();
            volverJugar();
            break;
        default:
             JOptionPane.showMessageDialog (null, "Las unicas opciones validas son amigo o solo");
             break;
             volverEmpezar = true;
    }
    }while(volverEmpezar = true);
    
    }
    
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
        int acertado = 0; // no se ha acertado
        for (int i=0;i<intentos; i++){
             num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if(num1==num2){
                JOptionPane.showMessageDialog(null,"Muy bien has acertado el numero "+num1);
                acertado = 1;
                break;
            }else if (num1>num2){
                JOptionPane.showMessageDialog(null,"Prueba con un numero mayor");
                comparar();
            }else if (num1<num2){
                JOptionPane.showMessageDialog(null,"Prueba con un numero mas pequeño");
                comparar();
        }
    } if (acertado == 0 ){
        JOptionPane.showMessageDialog(null,"Ohhhhh has perdido");
        
    }else {
        JOptionPane.showMessageDialog(null,"Enhorabuena has ganado");
        
    }
    }
    
    public void comparar(){
        diferencia = Math.abs(num1-num2);
    if (diferencia>=20){
         JOptionPane.showMessageDialog(null,"Aun estas muy lejos");
    }else if(diferencia>10 && diferencia<20 ){
        JOptionPane.showMessageDialog(null,"Aun estas lejos");
    } else if (diferencia>5 && diferencia < 10){
        JOptionPane.showMessageDialog(null,"Estas cerca");
    }else if (diferencia < 5){
        JOptionPane.showMessageDialog(null,"Estas muy cerca");
    }
    }
    
    public void volverJugar(){
        boolean volverEmpezar;
    
     
     do {
          novoIntento = (JOptionPane.showInputDialog("¿Quieres volver a jugar"));
     switch (novoIntento){
             
         case "si":
             modoJuego();
             break;
         case "no":
             JOptionPane.showMessageDialog(null,"Gracias por jugar");
             break;
         default:
             JOptionPane.showMessageDialog (null, "Las unicas opciones validas son si o no");
             volverEmpezar=true;
             break;
             
     }}while (volverEmpezar=true);
     }}

    
    

     


