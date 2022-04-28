import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 정렬하기
        Arrays.sort(phone_book);
        
        // 접두어인지 확인
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 접두어라면
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                // false 리턴
                return false;
            }
        }
        
        // 접두어가 없으면 true 리턴
        return true;
    }
}