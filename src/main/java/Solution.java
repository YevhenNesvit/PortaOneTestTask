public class Solution {

    public char getFirstUniqueCharInOneWord(String s) {
        char result = ' ';
        for(char i : s.toCharArray()){
            if (s.indexOf(i) == s.lastIndexOf(i)) {
                result = i;
                break;
            }
        }

        return result;
    }
}
