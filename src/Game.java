import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private boolean exit;

    public Game(){
        exit = false;
    }

    public void chooseDungeon(){
        char choice;

        System.out.println("Lailaps: Yohane! Where should we go now?");
        System.out.println();
        System.out.printf("HP: %d / 3                      Total Gold: %d GP", 0, 0);
        System.out.println("Item on Hand: N/A");
        System.out.println();

        System.out.println("[1] Visit                     [I]nventory");
        System.out.println("[2] Visit                     [S]ave and Quit");
        System.out.println("[3] Visit");

        System.out.println();
        System.out.println();

        System.out.print("Choice: ");
        choice = scanner.next().charAt(0);
    }
}
