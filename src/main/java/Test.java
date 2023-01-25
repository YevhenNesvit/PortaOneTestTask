import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String text = in.next();

        char uniqueCharInOneWord = solution.getFirstUniqueCharInOneWord(text);
        if (uniqueCharInOneWord == ' ') {
            System.out.println("Either all characters are repeating or string is empty");
        } else {
            System.out.println("First non-repeating character is " + uniqueCharInOneWord);
        }
    }
}
