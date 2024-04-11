/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;

public class Janela extends JFrame {
  
    public Janela(){
        super("Nossa primeira Janela");
        setSize(300,150);
        setVisible(true);}
    
        public static void main(String args[]){
         Janela app = new Janela();
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

