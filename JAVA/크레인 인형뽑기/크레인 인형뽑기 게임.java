import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            int pos = moves[i] - 1;
            
            for (int j = 0; j < board.length; j++) {
                if (board[j][pos] != 0) {
                    if (!st.isEmpty() && st.peek() == board[j][pos]) {
                        st.pop();
                        answer += 2;
                    }
                    else
                        st.push(board[j][pos]);
                    
                    board[j][pos] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}