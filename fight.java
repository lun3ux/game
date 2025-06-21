public class fight {

    static Player Player = game.player;
    Enemy Tabby = new Enemy("Tabby");
    
    public static void main(String[] args) {
        
    }
    public static void fight() {
        String name = Player.getName();
        Cat.Fighting();
        ui.printHeader("You're fighting Tabby cat!");
        ui.printHealthBar(Player.name, Player.getHealth(), Player.maxHealth);
        ui.printMenu();
        }
}