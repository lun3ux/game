import java.util.Scanner;


class ui {

    static Scanner sc = new Scanner(System.in);    
    
        public static void printHeader(String title) {
            String border = "═".repeat(title.length() + 4);
            System.out.println("╔" + border + "╗");
            System.out.println("║  " + title + "  ║");
            System.out.println("╚" + border + "╝");
        }
    
        public static void printHealthBar(String name, int health, int maxHealth) {
            int barLength = 20;
            int filled = (int) ((double) health / maxHealth * barLength);
            String bar = "█".repeat(filled) + "-".repeat(barLength - filled);
            System.out.println(name + " HP: [" + bar + "] " + health + "/" + maxHealth);
        }
    
        public static void printMenu() {
            System.out.println("╔══════════════════╗");
            System.out.println("║ 1. Scratch       ║");
            System.out.println("║ 2. Hiss          ║");
            System.out.println("║ 3. Groom (Heal)  ║");
            System.out.println("║ 4. Use Item      ║");
            System.out.println("╚══════════════════╝");
            TypingAnimation.printWithTypingEffect("Select Action Number:", 10);
            
            int Action = sc.nextInt();
            switch (Action) {
                case 1 -> {
                    
                }
            }

    }
}
