package datastructure.jpmorgancodevue;

/**
 * Write a program that finds the longest common suffix between two strings.
 * Print the common prefix of the two strings.
 * Example:
 * 1. S1=Bangalore , S2=Mangalore. Answer will be “angalore”.
 * 2. S1="abc" and S2="abcd".
 */
//Time Complexity: O(m*n).
public class FindLongestCommonSubString {


    public static void main(String args[]) {
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";

        String result = findLongestSubString("Bangalore", "Mangalore");
        System.out.println("Longest Common SubString is=" + result);
    }

    //The time complexity of this algorithm is o(m*n)
    private static String findLongestSubString(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        int max = 0;
        int endIndex = -1;

        for (int i = 0; i < m; i++) { // rows
            for (int j = 0; j < n; j++) { //columns
                //if the current characters of the Strings S1 and S2 matches
                if (s1.charAt(i) == s2.charAt(j)) {
                    // If first row or column
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        // add 1 to diagonal value
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if (max < dp[i][j]) {
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return s1.substring(endIndex - max + 1, endIndex + 1);
    }

}
