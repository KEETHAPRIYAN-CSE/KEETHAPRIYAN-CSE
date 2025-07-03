package PORTSIDE;

import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner vari = new Scanner(System.in);
        System.out.println("Enter first term: ");
        int a = vari.nextInt();
        System.out.println("Enter common difference: ");
        int d = vari.nextInt();
        System.out.println("Enter number of terms: ");  
        int n = vari.nextInt();
        int nthTerm = a + (n - 1) * d;
        System.out.println("The nth term of the arithmetic progression is: " + nthTerm);
        vari.close();
    }
}
