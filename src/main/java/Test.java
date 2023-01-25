import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        StringBuilder text = new StringBuilder();
        while (in.hasNextLine()) {
            text.append(in.nextLine());
        }

        char uniqueChar = solution.getFirstUniqueChar(text.toString());
        System.out.println("First non-repeating character is " + uniqueChar);
        in.close();
    }
}
