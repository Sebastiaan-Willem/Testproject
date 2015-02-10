
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
        
        System.out.print("Wat wil je doen?\n1. Optellen\n2. Aftrekken\n3. Vermenigvuldigen\n4. Delen\n5. Exit\n");
        System.out.print("Kies het juiste nummer: ");
        int keuze = sc.nextInt();
        
        System.out.print("Geef een geheel getal in: ");
        int getal = sc.nextInt();
        
        int cijfer = 0;
        
        switch (keuze) {
            case 1: System.out.print("Hoeveel wil je erbij optellen? ");
                cijfer = sc.nextInt();
                System.out.printf("%d + %d = %d%n", getal, cijfer, telOp(getal, cijfer));
                break;
            case 2: System.out.print("Hoeveel wil je ervan aftrekken? ");
                cijfer = sc.nextInt();
                System.out.printf("%d - %d = %d%n", getal, cijfer, telAf(getal, cijfer));
                break;
            case 3: System.out.print("Hoeveel wil je ermee vermenigvuldigen? ");
                cijfer = sc.nextInt();
                System.out.printf("%d * %d = %d%n", getal, cijfer, vermenigvuldig(getal, cijfer));
                break;
            case 4: System.out.print("Hoeveel wil je delen? ");
                cijfer = sc.nextInt();
                System.out.printf("%d/%d = %.2f%n", getal, cijfer, deel(getal, cijfer));
                break;
            case 5: break;
        }
    }
    
    public void print() {
        System.out.println("Test Test");
    }
    
    public static int telOp(int getal, int nummer) {
        int som = getal + nummer;
        return som;
    }
    
    public static int telAf(int getal, int nummer) {
        int resultaat = getal - nummer;
        return resultaat;
    }
    
    public static int vermenigvuldig(int getal, int nummer) {
        int resultaat = getal * nummer;
        return resultaat;
    }
    
    public static double deel(int getal, int nummer) {
        double resultaat = (double) getal/nummer;
        return resultaat;
    }
}
