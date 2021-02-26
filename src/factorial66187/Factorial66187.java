/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial66187;

/**
 *
 * @author Alondra Palma
 */
public class Factorial66187 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num = 10;
        int factorial = 1;
        
        while (num!= 0){ 
            factorial = factorial * num;
            num--;
            
        }
        System.out.println("factorial = " + factorial);
    }
    
}
