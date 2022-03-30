import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();

        // 모든 값들을 탐색
        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고, 현재 가격이 이전 가격보다 작으면
            // 과거에 들어있던 값들도 다 체크를 해줘야하므로
            // 반복문을 통해서 검사
            while (!st.isEmpty() && prices[i] < prices[st.peek()]) {
                // 현재 인덱스 - 스택의 peek의 인덱스
                answer[st.peek()] = i - st.peek();
                // 스택에서 빼기
                st.pop();
            }
            // 스택에 넣기
            st.push(i);
        }

        // 스택이 비어있지 않다면
        // 한번도 가격이 떨어지지 않은 경우라는 뜻
        // 스택이 모두 비워질 때까지 반복해서 체크
        while (!st.isEmpty()) {
            // 가격 시점의 마지막 인덱스 - 스택의 peek의 인덱스
            answer[st.peek()] = (prices.length - 1) - st.peek();
            // 스택에서 빼기
            st.pop();
        }

        return answer;
    }
}