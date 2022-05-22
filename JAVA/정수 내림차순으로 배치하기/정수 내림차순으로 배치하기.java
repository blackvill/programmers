import java.util.*;

class Solution {
    public long solution(long n) {
        // 길이를 구하기 쉽게 문자열로 변경
        String str = n + "";
        // 정렬해서 문자열로 만들기 위한 문자열 초기화
        String ans = "";
        // 각 자리를 잘라서 정렬하기 위한 배열
        char[] arr = new char[str.length()];
        
        // 잘라서 배열에 값을 담아주기
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        
        // 오름차순으로 정렬
        Arrays.sort(arr);
        
        // 오름차순 정렬된 것을 뒤에서부터 값을 구해서 내림차순으로 바꿔줌
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i];
        }
        
        // Long형으로 바꿔서 리턴
        return Long.parseLong(ans);
    }
}