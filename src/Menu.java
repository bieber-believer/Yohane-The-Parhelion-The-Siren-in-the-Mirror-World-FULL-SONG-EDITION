import java.util.Scanner;

public class Menu {
    public char choice;
    public boolean exit;
    Scanner scanner = new Scanner(System.in);

    public void menuLoop(){
        do{
            mainMenu();
            if(choice == 'n'){
                //screen clears game starts
            }
            else if (choice == 's') {
                //screen clears and status shows
                status();
            }
            else{
                this.exit = true;
            }
        }while (!exit);
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
        choice = scanner.nextLine().toLowerCase().charAt(0);
    }

    public void status(){
            System.out.println("       ************************************************");
            System.out.println("                         Overall Status                ");
            System.out.println("       ************************************************");

            System.out.printf("        Times Chika was saved %17d times\n", 0);
            System.out.printf("        Times You was saved %19d times\n", 0);
            System.out.printf("        Times Riko was saved %18d times\n", 0);
            System.out.printf("        Times Hanamaru was saved %14d times\n", 0);
            System.out.printf("        Times Ruby was saved %18d times\n", 0);
            System.out.printf("        Times Dia was saved %19d times\n", 0);
            System.out.printf("        Times Kanan was saved %17d times\n", 0);
            System.out.printf("        Times Mari was saved %18d times\n\n", 0);

            System.out.printf("        Times Siren was defeated %14d times\n\n", 0);

            System.out.printf("        No. of game overs %21d times\n\n", 0);

            System.out.printf("        Total gold spent %22d gp\n", 6665);
            System.out.println("       ************************************************");

            System.out.print("Press Enter to go back to Menu....");
            scanner.nextLine();
    }
}
