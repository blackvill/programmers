import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // A와 B 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 길이가 같으니까 A 길이만큼 반복
        for (int i = 0; i < A.length; i++) {
            // 가장 작은 수와 가장 큰 값을 곱하는게 결과적으로 최소값이 나온다.
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}