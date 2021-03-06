
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        System.out.println("Loops");
          
//        userAge();
//        domaci();
//        switchLoop();
//        whileLoop();
//        doWhileLoop();
//        forLoop();
        square();
        triangle();
        
    }
    
    static void userAge() {
        System.out.println("Koliko imate godina?");
        Scanner in = new Scanner(System.in);
        int userAge = in.nextInt();

        System.out.println("Unesli ste broj: " + userAge);
    }
    
    static void domaci() {
        
        System.out.println("Koliko imate godina?");
        
        Scanner in = new Scanner(System.in);
        int personAge = in.nextInt();
        
        System.out.println("Unesli ste broj: " + personAge);
        
           if (personAge < 0 || personAge > 150) {
            System.out.println("Uneli ste pogrešnu vrednost");
        } else if (personAge <= 5) {
            System.out.println("Baby");
        } else if (personAge <= 11) {
            System.out.println("Kid");
        } else if (personAge <= 17) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
    
     static void switchLoop() {
        System.out.println("Switch example");
        System.out.println("Unesite redni broj dana u nedelji (1-7): ");
        Scanner in2 = new Scanner(System.in);
        int dayNumber = in2.nextInt();
        
        String day;
        switch (dayNumber) {
            case 1:
                day = "Ponedeljak";
                break;
            case 2:
                day = "Utorak";
                break;
            case 3:
                day = "Sreda";
                break;
            case 4:
                day = "Cetvratak";
                break;
            case 5:
                day = "Petak";
                break;
            case 6:
                day = "Subota";
                break;
            case 7:
                day = "Nedelja";
                break;
            default:
                day = "Uneli ste pogresan broj";
                break;
        }
        System.out.println("Dan je: " + day);
    }
     
     static void whileLoop() {
         
        System.out.println("While loop example");
        
        int x = 5;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
        
        while (x > 0) {
            System.out.println(x);
            x--;
        }
        
        System.out.println("Trenutna vrednost broja X je: " + x);
        
        while (x > 5) {
            System.out.println(x);
            x--;
        }

     }
     
     static void doWhileLoop() {
     
        System.out.println("Do While loop example");
        
        int y = 45;
        do {
            System.out.println(y);
            y = y + 2;
        } while (y < 40);

     }
     
     static void forLoop() {
     
        System.out.println("For loop example");
       
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
        
        for (int i = 99; i >= 90; i--) {
            System.out.println("*");
        }
     }
    
    static void square() {
        
        for (int i=1; i <=30; i++) {
            for (int j=1; j <=30; j++) {
               System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
    static void triangle() {
        
         for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
        }
    }
    
}


