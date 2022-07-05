/* Author: Vincent X
 * Date: July 5, 2022
 * This program implements an algorithm to determine if a string 
 * has all unique characters. 
 */

public class IsUniqueChars {
    public static void main(String[] args) {
        System.out.println(isUniqueChars("great"));
        System.out.println(isUniqueChars("high"));
    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            // already found this char in string
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}