import java.util.Scanner;
public class GuessINT2 {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int count = 1;
        int number = (int)(Math.random() * 100);
        int guess = 0;
        boolean wrong = true;
        System.out.println("i am thinking a number, could you try to guess it ?");
        while (wrong){
            System.out.print("guess the number: ");
            guess = s.nextInt();
            if (number == guess){
                System.out.println("CORRECT, the number is indeed "+ number+" in only "+ count+ " tries");
                wrong = false;
            } else if (guess > number) {
                System.out.println("the number is too big");
                count ++;
            }
            else {
                System.out.println("The number is too small");
                count ++;
            }
        }
    }
}