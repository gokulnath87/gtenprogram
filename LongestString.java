import java.util.LinkedHashMap;

public class LongestString {
        static void longestSubstring(String inputString) {
            char[] arr1 = inputString.toCharArray();
            String long_str = null;
            int str_length = 0;
            LinkedHashMap< Character, Integer >
                    charMap = new LinkedHashMap < Character, Integer >();
            for (int i = 0; i < arr1.length; i++) {
                char ch = arr1[i];
                if (!charMap.containsKey(ch)) {
                    charMap.put(ch, i);
                } else {
                    i = charMap.get(ch);
                    charMap.clear();
                }
                if (charMap.size() > str_length) {
                    str_length = charMap.size();
                    long_str = charMap.keySet().toString();
                }
            }
            System.out.println("Input String : " + inputString);
            System.out.println("The longest substring : " + long_str);
            System.out.println("The longest Substring Length : " + str_length);
        }
    public static void main(String[] args) {
        longestSubstring("abcabcbb");
    }
}
