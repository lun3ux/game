

class Cat {


    public static void Fighting() {
        System.out.println(" _._     _,-'\"\"`-._");
        System.out.println("(,-.`._,'(       |\\`-/|");
        System.out.println("    `-.-' \\ )-`( , o o)");
        System.out.println("          `-    \\``\"'-");
    }
    public static void sleeping() {
        System.out.println("      |\\      _,,,---,,_");
        System.out.println("ZZZzz /,`.-'`'    -.  ;-;;,_");
        System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("    '---''(_/--'  `-\\_)");
    }

    static String name;
        static int health;
                int maxHealth;
                int level;
                
                public Cat(String name, int health, int level) {
                    this.name = name;
                    this.health = health;
                    this.maxHealth = health;
                    this.level = level;
                }
            
                public boolean isAlive() {
                    return health > 0;
                }
                
                public void takeDamage(int damage) {
                    health -= damage;
                    if (health < 0) health = 0;
                }

            }
        
            class Enemy extends Cat {
                public Enemy(String name) {
                    super(name, 15,1);
                    Enemy.name="Tabby";
                    
                }
            
            class Player extends Cat {
                public Player(String name) {
                    super(name, 20,1);
                }
                public void heal() {
                    health += 5;
                    if (health > maxHealth) health = maxHealth;
                    System.out.println(name + " licks their paw and heals 5 HP!");
                }
                public void attack() {
                    int damage = level + 5;
                    System.out.println(Player.name + " scratches " + Enemy.name + " for " + damage + " damage!");
                Enemy.health -= damage;
    }
}
            }