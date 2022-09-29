package datastructure.codility.primeandcompositenumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the maximum number of flags that can be set on mountain peaks.
 */
public class FindMaximumFlags {


    public static void main(String[] args) {

        int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        int result = solution(A);
        System.out.println(result);
    }

    private static int solution(int[] A) {

        //1. Find the peaks first
        List<Integer> peaksArray = findPeaks(A);
        if (peaksArray.size() == 1 || peaksArray.size() == 0) {
            return peaksArray.size();
        }
        //2. use binary to find the flag number, start = 1, end = array.size(). make flag = (start + end) / 2;
        int startFlag = 1;
        int endFlag = peaksArray.size();
        int result = 1;
        while (startFlag <= endFlag) {
            int flag = (startFlag + endFlag) / 2;
            boolean suc = false;
            int used = 0;
            int mark = peaksArray.get(0);
            for (int i = 0; i < peaksArray.size(); i++) {
                if (peaksArray.get(i) >= mark) {
                    used++;
                    mark = peaksArray.get(i) + flag;
                    if (used == flag) {
                        suc = true;
                        break;
                    }
                }
            }

            if (suc) {
                result = flag;
                startFlag = flag + 1;
            } else {
                endFlag = flag - 1;
            }

        }
        return result;
    }

    private static List<Integer> findPeaks(int[] A) {
        List<Integer> peaksArray = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                peaksArray.add(i);
            }
        }
        return peaksArray;
    }


}
