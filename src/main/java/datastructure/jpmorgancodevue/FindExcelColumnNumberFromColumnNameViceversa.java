package datastructure.jpmorgancodevue;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * <p>
 * column  column number
 * A  ->  1
 * B  ->  2
 * C  ->  3
 * ...
 * Z  ->  26
 * AA ->  27
 * AB ->  28
 * Examples:
 * <p>
 * Input: A
 * Output: 1
 * A is the first column so the output is 1.
 * <p>
 * Input: AA
 * Output: 27
 * The columns are in order A, B, ..., Y, Z, AA ..
 * So, there are 26 columns after which AA comes.
 * <p>
 * Input: Y
 * Output: 25
 * <p>
 * Input: BA
 * Output: 53
 * <p>
 * Approach: The process is similar to binary to decimal conversion.
 * For example, to convert AB, the formula is 26 * 1 + 2.
 * As another example,
 * <p>
 * To convert CDA,
 * 3*26*26 + 4*26 + 1
 * = 26(3*26 + 4) + 1
 * = 26(0*26 + 3*26 + 4) + 1
 * So it is very much similar to converting binary to decimal keeping the base as 26.
 * Take the input as string and the traverse the input string from the left to right and calculate the result as follows:
 * result = 26*result + s[i] - 'A' + 1
 */
public class FindExcelColumnNumberFromColumnNameViceversa {

    public static void main(String[] args) {

        int a =  'A' + 12;
        char c =  'A' + 1;
        System.out.println(" integer = " + a);
        System.out.println("character= " + c);
        //Get Column number
        System.out.println(getColumnNumber("Z"));
        System.out.println(getColumnNumber("AA"));
        System.out.println(getColumnNumber("BA"));
        System.out.println(getColumnNumber("BZ"));

        //Get Column Name
        System.out.println(getNthColumnName(26));
        System.out.println(getNthColumnName(27));
        System.out.println(getNthColumnName(52));
    }

    private static int getColumnNumber(String columnName) {
        int columnNumber = 0;
        for (int i = 0; i < columnName.length(); i++) {
            columnNumber = columnNumber * 26;
            columnNumber = columnNumber + columnName.charAt(i) - 'A' + 1;
        }
        return columnNumber;
    }

    private static String getNthColumnName(int columnNumber) {
        String name = "";
        //columnNumber starts with 1
        while (columnNumber > 0) {
            columnNumber--;
            name = (char) ('A' + columnNumber % 26) + name;
            columnNumber = columnNumber / 26;
        }
        return name;
    }
}
