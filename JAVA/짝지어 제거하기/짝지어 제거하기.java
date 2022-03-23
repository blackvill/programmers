import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
            // 스택이 비어있지 않고
            // 스택의 맨 위가 일치하면
			if (!stack.isEmpty() && stack.peek() == c)
                stack.pop(); // 제거
			else // 아니면
                stack.push(c); // 추가
		}

        // 스택이 비어있으면 1 출력 아니면 0출력
		return stack.isEmpty() ? 1 : 0;
    }
}