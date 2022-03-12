public class IsUniqueChars {
    public static void main(String args[]) {
        String s = "It's sunny";
        
        System.out.println(isUniqueChars(s));
    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128]; // default is false

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            // Already found this char in string
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;        
    }
}