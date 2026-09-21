class Solution {
    public String countAndSay(int n) {
        String str = "1";

        for (int i = 1; i < n; i++) {
            String ans = "";
            int count = 1;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    count++;
                } else {
                    ans = ans + count + str.charAt(j - 1);
                    count = 1;
                }
            }

            ans = ans + count + str.charAt(str.length() - 1);
            str = ans;
        }

        return str;
    }
}