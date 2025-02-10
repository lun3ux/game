import java.util.Scanner;

class game{
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Cat.sleeping();
        Cat.Fighting();
        Start();
    }

    public static void Sleep(long delay) throws InterruptedException {
        Thread.sleep(delay);
    }

    public static void Start() throws InterruptedException {
    
        TypingAnimation.printWithTypingEffect("So...", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("This is my first time coding something like this.", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("There probably will be bugs, and weird things, and it will look like shit.", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("But its for you! for valentines day!", 50);
        Sleep(2000);
        TypingAnimation.printWithTypingEffect("So enjoy!",50);
        TypingAnimation.printWithTypingEffect("You woke up, lying in a small patch of grass in a forest", 50);
        TypingAnimation.printWithTypingEffect("You had a strange dream before you woke up... what was it again?", 50);
        System.out.println("TRY TO REMEMBER? Y/N");
        String response = sc.nextLine();
        switch(response) {
            case "Y":
            {
                Prolouge();
            }
            case "N":
            {
                TypingAnimation.printWithTypingEffect("You shake your head and memories are coming back to you.", 50);
            }
        }

    }
    public static void Prolouge() throws InterruptedException {
       TypingAnimation.printWithTypingEffect("You try your best to focus on what your dream was about.", 50);
       TypingAnimation.printWithTypingEffect("...", 3000);
    }
}