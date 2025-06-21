
class Cat {


    protected static String name;
    protected static int health;
    protected static int maxHealth;
    protected static int level;

    public Cat(String name, int health, int level) {
        Cat.name = name;
        Cat.health = health;
        Cat.maxHealth = health;
        Cat.level = level;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    
        public void heal() {
            health += 5;
            if (health > maxHealth) {
                health = maxHealth;
            }
            System.out.println(name + " licks their paw and heals 5 HP!");
        }

        public static void attack(Cat target) {
       int damage = level + 5;
       System.out.println(name + " scratches " + target.name + " for " + damage + " damage!");
       target.takeDamage(damage);
     }

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

}

class Enemy extends Cat {

    public Enemy(String name) {
        super(name, 15, 1);
        Enemy.name = name;

    }

}
class Player extends Cat {

        public Player(String name) {
            super(name, 20, 1);
        }
}
