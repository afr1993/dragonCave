import java.util.Random;
public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);//No need to import library
        Random random = new Random();//need to import library

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "You see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2) :");

        int option = scanner.nextInt();
        int dangerCave= random.nextInt(2)+1;//Randomly assing a number between 1 and 2
        System.out.println("You approach the cave…\n" +
                "It is dark and spooky…\n" +
                "A large dragon jumps out in front of you!\n" +
                "He opens his jaws and…");
        if(option == dangerCave){
            System.out.println("Gobbles you down in one bite!");
        }else{
            System.out.println("Share his treasure, congrats you win");
        }
        scanner.close();
    }
}