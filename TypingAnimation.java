
public class TypingAnimation {
    public static void printWithTypingEffect(String text, long delay) {
        for(char character : text.toCharArray()) {
            System.out.print(character);
            try {
                game.Sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println();
    }   
}