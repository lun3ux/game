
import java.util.Scanner;

class game {

    static Scanner sc = new Scanner(System.in);
    static Player player;
    static class Player {
        String name;
        public Player(String name) { this.name = name; }
        public String getName() { return name; }
    }

    static class TypingAnimation {
        public static void printWithTypingEffect(String text, long delay) throws InterruptedException {
            System.out.println(text);
            Thread.sleep(delay);
        }
    }

    static class ui {
        public static void printHeader(String header) {
            System.out.println("=== " + header + " ===");
        }
    }

    static class Cat {
        public static void Fighting() {
            System.out.println("Cat is fighting!");
        }
    }

    public static void titlescreen() {
        ui.printHeader("UNNAMED GAME!");
    }

    public static void main(String[] args) throws InterruptedException {
        titlescreen();
        player = new Player("");
        skip();
    }

    public static void Sleep(long delay) throws InterruptedException {
        Thread.sleep(delay);
    }

    public static void StartingDialouge() throws InterruptedException {
        TypingAnimation.printWithTypingEffect("So...", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("This is my first time coding something like this.", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("There probably will be bugs, and weird things, and it will look like shit.", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("So enjoy!", 50);
        TypingAnimation.printWithTypingEffect("You woke up, lying in a small patch of grass in a forest", 50);
        TypingAnimation.printWithTypingEffect("You had a strange dream before you woke up... what was it again?", 50);
        ui.printHeader("TRY TO REMEMBER? Y/N");
    }

    // For raw development documentation, see: https://github.com/Josue/game/blob/main/README.md

    public static void Start() throws InterruptedException {

        String response = sc.nextLine();
        switch (response) {
            case "Y":
            case "y": {
                Prolouge();
                break;
            }
            case "N":
            case "n": {
                TypingAnimation.printWithTypingEffect("You shake your head and memories start to come back.", 50);
            }
            default: {
                TypingAnimation.printWithTypingEffect("Lets just assume you tried to remember.", 50);
            }
        }

    }

    public static void Name() {
        String name = sc.nextLine();
        player.name = name;
    }

    public static void Prolouge() throws InterruptedException {
        TypingAnimation.printWithTypingEffect("You try your best to focus on what your dream was about.", 50);
        TypingAnimation.printWithTypingEffect("...", 1000);
        TypingAnimation.printWithTypingEffect("You're a cat! thats... meant to bring a fish, to the cat queen!", 20);
        TypingAnimation.printWithTypingEffect("But you forgot... what was your name again?", 50);
        Name();
        String name = player.getName();
        TypingAnimation.printWithTypingEffect("That was it... " + name + "!" + "But someones in your way!", 20);
        fight.fight();
    }

    public static void skip() throws InterruptedException {
        TypingAnimation.printWithTypingEffect("Skip Start?", 50);
        String x = sc.nextLine();
        switch (x) {
            case "Y", "y" -> {
                Prolouge();
            }
            case "N", "n" ->  {
                StartingDialouge();
                Start();
            }
            default -> {
                TypingAnimation.printWithTypingEffect("I'll take that as a no.", 50);
                StartingDialouge();
                Start();
            }
        }
    }
}
