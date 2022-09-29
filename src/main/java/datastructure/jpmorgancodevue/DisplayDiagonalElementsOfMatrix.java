package datastructure.jpmorgancodevue;

/**
 * Write a program to display diagonal elements of matrix.
 * <p>
 * Given a 2D square matrix, print the Principal and Secondary diagonals.
 * Examples:
 * Input:
 * 4
 * 1 2 3 4
 * 4 3 2 1
 * 7 8 9 6
 * 6 5 4 3
 * Output:
 * Principal Diagonal: 1, 3, 9, 3
 * Secondary Diagonal: 4, 2, 8, 6
 * <p>
 * Input:
 * 3
 * 1 1 1
 * 1 1 1
 * 1 1 1
 * Output:
 * Principal Diagonal: 1, 1, 1
 * Secondary Diagonal: 1, 1, 1
 */
public class DisplayDiagonalElementsOfMatrix {


    public static void main(String[] args) {
        int n = 4;
        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        printPrincipalDiagonals(a, n);
        printSecondaryDiagonals(a, n);
    }

    //Time Complexity: O(n2).
    //As there is a nested loop involved so the time complexity is squared.
    private static void printPrincipalDiagonals(int[][] mat, int n) {
        int principal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println(mat[i][j] + ", ");
                    principal = principal + mat[i][j];

                }
            }
        }
        System.out.println("Sum of principal diagonal elements " + principal);
    }

    private static void printSecondaryDiagonals(int[][] mat, int n) {
        int secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    System.out.println(mat[i][j] + ",");
                    secondary = secondary + mat[i][j];
                }
            }
        }
        System.out.println("Sum of secondary diagonal elements " + secondary);
    }
}
