import java.util.Scanner;

public class fight {

    //static Player Player = new Player(game.player.getName());
    static Player Player = new Player("Lune");
    static Enemy Tabby = new Enemy("Tabby");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (Player.isAlive() && Tabby.isAlive()) {
            fight();
        }
        if (!Player.isAlive()) {
            System.out.println("You lost!");
        } else {
            System.out.println("You won!");
        }
    }

    public static void fight() {
        Cat.Fighting();
        ui.printHeader("You're fighting Tabby cat!");
        ui.printHealthBar(Player.getName(), Player.getHealth(), Player.getMaxHealth());
        ui.printHealthBar(Tabby.getName(), Tabby.getHealth(), Tabby.getMaxHealth());
        ui.printMenu();
        action();
        if (Tabby.isAlive()) {
            enemyfight();
        }
    }

    public static void action() {
        int Action = sc.nextInt();
        switch (Action) {
            case 1:
                Player.attack(Tabby);
                break;
            case 2:
                Player.Hiss();
                break;
            case 3:
                Player.heal();
                break;
            case 4:
                System.out.println("[[IM really sorry, i havent made an inventory system yet QWQ]]");
                break;
        }
    }

    public static void enemyfight() {
        int choice = (int)(Math.random() * 2) + 1;
        if (choice == 1) {
            Tabby.attack(Player);
        } else {
            Tabby.heal();
        }
    }
}