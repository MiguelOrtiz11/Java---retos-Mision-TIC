/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;
import java.util.*;

/**
 *
 * @author migue
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Digite su edad: ");
        edad=sc.nextInt();
        if (edad < 4){
            System.out.println("La edad que acaba de digitar es: " + edad + "\n El precio de su entrada es gratis :D");
        }else{
            if (edad > 4 && edad < 18){
                System.out.println("La edad que acaba de digitar es: " + edad + "\n El precio de su entrada es 5000 :D");
            }else{
                if (edad > 18){
                    System.out.println("La edad que acaba de digitar es: " + edad + "\n El precio de su entrada es 10000 :D");
                    
                }
            }
            
            
            
        }
        
        }
    
}
