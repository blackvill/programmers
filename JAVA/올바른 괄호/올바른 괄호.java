import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        boolean answer = true;
        
        for (int i = 0; i < s.length(); i++) {
            // '('면 넣기
            if (s.charAt(i) == '(')  
                st.push('(');
            // ')'라면
            else {
                // 스택이 비어있으면 들어오면 안됨
                if (st.isEmpty()) 
                    return false;
                // 비어있지 않으면 '(' 가 있는 상태니까 스택에서 꺼내기
                else
                    st.pop();    
            }
        }
        
        // 스택이 비어있으면 true 아니라면 false
        if (st.isEmpty())
            answer = true;
        else
            answer = false;

        return answer;
    }
}