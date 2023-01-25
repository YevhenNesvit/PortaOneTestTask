import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String text = in.next();

        int firstIndex = Solution.firstNonRepeating(text);
        if (firstIndex == -1) {
            System.out.println("Either all characters are repeating or string is empty");
        } else {
            System.out.println("First non-repeating character is " + text.charAt(firstIndex));
        }
    }
}
