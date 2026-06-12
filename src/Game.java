import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private boolean exit = false;
    private static char choice;

    public Game(){

    }

    public void mainMenu(){
        System.out.println("       ************************************************");
        System.out.println("       *             Yohane The Parhelion!            *");
        System.out.println("       *        The Siren in the Mirror World!        *");
        System.out.println("       ************************************************");

        System.out.println("                 [N]ew Game");
        System.out.println("                 [S]tatus");
        System.out.println("                 [Q]uit");

        System.out.print("Your choice: ");
        choice = scanner.next().toLowerCase().charAt(0);

        System.out.println(choice);
    }
}
