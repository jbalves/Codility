// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A == null) return null;
        int j = 0;
        int[] B = Arrays.copyOf(A,A.length);
        int arrayLength = A.length - K;
        
        for(int i = 0; i < K ; i++){
            B[i] = A[arrayLength];
            arrayLength++;
        }
        
        for(int i = K; i < A.length ; i++){
            B[i] = A[j];
            j++;
        }
        
        return B;
    }
}
