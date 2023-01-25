public class Solution {

    public static int firstNonRepeating(String str) {
        int[] fi = new int[256];

        for (int i = 0; i < 256; i++) {
            fi[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (fi[str.charAt(i)] == -1) {
                fi[str.charAt(i)] = i;
            } else {
                fi[str.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < 256; i++) {
            if (fi[i] >= 0) {
                res = Math.min(res, fi[i]);
            }
        }

        if (res == Integer.MAX_VALUE) {
            return -1;
        } else {
            return res;
        }
    }
}
