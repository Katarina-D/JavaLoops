
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
          System.out.println("Loops");
          
        int age = 18;
        if (age >= 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        }
        
        System.out.println("Koliko imate godina?");
        Scanner in = new Scanner(System.in);
        int age2 = in.nextInt();
        
        System.out.println("Unesli ste broj: " + age2);
        
        // 0-2 beba
        // 3-10 dete
        // 12-17 tinejdzer
        // 18+ odrasla
    }
    
}
