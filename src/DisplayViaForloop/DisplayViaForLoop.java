/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DisplayViaForloop;

/**
 *
 * @author HP
 */
public class DisplayViaForLoop {
     public static void main(String[] args) {
        
        //Arrays 
        String[] names = {"Davram", "Taptap", "Dav", "Do"};
        String[] year = {"First year", "Second Year", "Third year", "Fourth year"};
        
        //Foor Loops to Print All the values of the variable year and names
        for(int i = 0; i < year.length; i++) {
             //Output
             System.out.println(names[i] + " " + year[i]);
         }
         
     }

}
