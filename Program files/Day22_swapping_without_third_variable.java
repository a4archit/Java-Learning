import java.util.Scanner;

class Day22_swapping_without_third_variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int a,b;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        
        // displaying numbers before swapping
        System.out.println("\n\nBefore swapping \n\ta = " + a + "\n\tb = " + b);
        
        // swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("\n\nAfter swapping\n\ta = " + a + "\n\tb = " + b);
        
    }
}    
