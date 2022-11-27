/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiminema;

/**
 *
 * @author Justin
 */
public class GUIMINEMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        
        Movie mv = new Movie("Black Panther", "17.00 - 19.14");
        System.out.println(mv);
    }
    
}
