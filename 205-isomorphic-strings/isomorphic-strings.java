class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (reverse.containsKey(ch2)) {
                    return false;
                }

                map.put(ch1, ch2);
                reverse.put(ch2, ch1);
            }
        }

        return true;
    }
}