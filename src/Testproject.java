
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Silke
 */
public class Testproject {
    private static int getal;
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Geef een geheel getal in: ");
        int getal = sc.nextInt();
        
        System.out.print("Hoeveel wil je erbij optellen? ");
        int optelGetal = sc.nextInt();
        
        int som = telOp(getal, optelGetal);
        
        System.out.printf("%d + %d = %d%n", getal, optelGetal, som);
    }
    
    public void print() {
        System.out.println("Test Test");
    }
    
    public static int telOp(int getal, int nummer) {
        int som = getal + nummer;
        return som;
    }
}
