import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to Nathan's game!\nWhat is your name?");
        String playerName = scanner.nextLine();

        System.out.println("Announcer: " + playerName + " brings the ball up the floor with ten seconds left on the clock. Time is ticking.");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("You have a decision to make. Type the NUMBER of the option.\n" +
                "1 - Shoot the basketball at the last moment" + "\n" +
                "2 - Pass the basketball to a teammate for them to shoot it" + "\n" +
                "3 - Dribble the basketball to the basketball and attempt a layup");
        int option = scanner1.nextInt();

        if (option == 1) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Which day of the month is my birthday?");
            int birthdayDay = scanner2.nextInt();

            if (birthdayDay == 31) {
                System.out.println("BANG BANG, " + playerName + " at the buzzer! And they win it, " + playerName + " with the clutch three from downtown!");
            } else {
                System.out.println(playerName + " takes the shot at the buzzer, and it bounces off the rim.");
            }
        } else if (option == 2) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("What is my favourite color?");
            String color = scanner3.nextLine();

            if (color.equalsIgnoreCase("green")) {
                System.out.println(playerName + " passes the ball to Stephen Curry in the corner, who takes a three-pointer with defenders rushing towards him. \n" +
                        "The ball soars through the air in a perfect arc and splashes through the net.");
            } else if (color.equalsIgnoreCase("Green")) {
                System.out.println(playerName + " passes the ball to Stephen Curry in the corner, who takes a three-pointer with defenders rushing towards him. \n" +
                        "The ball soars through the air in a perfect arc and splashes through the net.");
            } else {
                System.out.println(playerName + " passes the ball to LeBron James, who takes a step-back and is blocked! A good attempt by King James, but better defense.");
            }
        } else if (option == 3) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("What is the month of my birthday?");
            String month = scanner4.nextLine();

            if (month.equalsIgnoreCase("January")) {
                System.out.println("With a quick crossover, " + playerName + " drives hard to the rim, rises up, and dunks it into the basket! The buzzer sounds, " +
                        "and " + playerName + " has done it once again!");
            } else if (month.equalsIgnoreCase("january")) {
                System.out.println("With a quick crossover, " + playerName + " drives hard to the rim, rises up, and dunks it into the basket! The buzzer sounds, " +
                        "and " + playerName + " has done it once again!");
            } else {
                System.out.println(playerName + " fakes a shot and drives towards the rim, with defenders all around him. He goes up for a crafty layup... \n" +
                        "Too strong, the ball hits the backboard as " + playerName + " falls to the ground.");
                {
                }
            }
        }
    }
}