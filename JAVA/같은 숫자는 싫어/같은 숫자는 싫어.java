import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 초기화
        int n = arr[0];
        
        // 배열 탐색
        for (int i = 1; i < arr.length; i++) {
            // 현재 값과 체크하는 값이 같으면 넘어가기
            if (n == arr[i])
                continue;
            // 다르면
            else {
                // 리스트에 추가
                list.add(n);
                // 체크하는 값을 현재값으로 갱신
                n = arr[i];
            }
        }
        // 마지막에 남은거 넣어주기
        list.add(n);
        
        int[] answer = new int[list.size()];
        
        // 리스트에 있는 값들을 배열에 담아주기
        int index = 0;
        for (int k : list) {
            answer[index++] = k;
        }
        
        return answer;
    }
}