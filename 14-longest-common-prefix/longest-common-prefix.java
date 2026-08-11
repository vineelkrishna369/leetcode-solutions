class Solution {
    public String longestCommonPrefix(String[] strs) {

        int j = 0;

        while (j < strs[0].length()) {

            char ch = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {

                if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                    return strs[0].substring(0, j);
                }
            }

            j++;
        }

        return strs[0];
    }
}
