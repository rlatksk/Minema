/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiminema;

import javax.swing.JFrame;

/**
 *
 * @author Justin
 */
public class GUIMINEMA extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        hm.setResizable(false);
    }
    
}
