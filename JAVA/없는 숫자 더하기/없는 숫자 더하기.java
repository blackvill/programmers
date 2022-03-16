import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int index = 0;
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < 10; i++) {
            if (index < numbers.length && numbers[index] == i) {
                index++;
                continue;
            }
            answer += i;
        }
        
        return answer;
    }
}