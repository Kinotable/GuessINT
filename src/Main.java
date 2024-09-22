import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
         int count = 1;
         int number = (int)(Math.random() * 100);
         int guess;
         System.out.println("i am thinking a number, could you try to guess it ?");
         do {
             System.out.print("guess the number: ");
             guess = s.nextInt();
             if (number == guess){
                 System.out.println("CORRECT, the number is indeed "+ number+" in only "+ count+ " tries");
             } else if (guess > number) {
                 System.out.println("the number is too big");
                 count ++;
             }
             else {
                 System.out.println("The number is too small");
                 count ++;
             }
         }
         while (guess != number && count <= 10);
        if (count >=10){
            System.out.println("too many tries, sucker");
        }

    }
}