/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;
import java.util.*;

/**
 *
 * @author migue
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  sc = new Scanner(System.in);
        int numero;
        int i;
        int resultado;
        System.out.print("Digite el numero a multiplicar: ");
        numero=sc.nextInt();
        for (i=1;i<=10;i++){
            resultado=numero*i;
            System.out.println(numero + " * " + i + "=" + resultado);
        }
                
    }
    
}
