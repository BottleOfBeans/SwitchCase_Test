import java.util.*;

public class Main {
    public static void main(String[] args){
        //Program that checks for the number 1 because it can
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number that is not 0 and positive");
            try{
                switch(input.nextInt()){
                    case 1:
                        System.out.println("You're good at this!");
                        System.exit(1);
                    case 2:
                        System.out.println("So close but so far, I'm quitting just because of this!");
                        System.exit(1);
                    case 3:
                        System.out.println("Colder and Colder! I'm quitting just because of this!");
                        System.exit(1);
                    default:
                        System.out.println("You're so bad I am just going to let you try again :).");
                }
            }catch(InputMismatchException errorOut){
                System.out.println("You got this wacky error (hint: you didn't give me a number): "+errorOut);
            }
        }

    }
}
