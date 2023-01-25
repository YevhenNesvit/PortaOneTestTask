public class Solution {

    public char getFirstUniqueCharInOneWord(String s) {
        char result = ' ';
        for (char i : s.toCharArray()) {
            if (s.indexOf(i) == s.lastIndexOf(i)) {
                result = i;
                break;
            }
        }

        return result;
    }

    public char getFirstUniqueChar(String text) {
        StringBuilder builder = new StringBuilder();
        String[] list = text.split(" ");

        for (String s : list) {
            builder.append(getFirstUniqueCharInOneWord(s));
        }

        return getFirstUniqueCharInOneWord(String.valueOf(builder));
    }
}
