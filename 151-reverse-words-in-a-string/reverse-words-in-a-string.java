// class Solution {
//     public String reverseWords(String s) {
//         String str = s.trim();
//         String s1 = "";
//         int l = str.length();
//         int j = l - 1;

//         while (j >= 0) {

//             while (j >= 0 && str.charAt(j) == ' ') {
//                 j--;
//             }

//             int end = j;

//             while (j >= 0 && str.charAt(j) != ' ') {
//                 j--;
//             }

//             for (int k = j + 1; k <= end; k++) {
//                 s1 += str.charAt(k);
//             }

//             if (j >= 0) {
//                 s1 += " ";
//             }
//         }

//         return s1;
//     }
// }
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String ans = "";

        for (int i = words.length - 1; i >= 0; i--) {
            ans += words[i];

            if (i != 0) {
                ans += " ";
            }
        }

        return ans;
    }
}