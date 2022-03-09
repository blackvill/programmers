import java.util.*;

class Solution {
    public String solution(String s) {
        // 입력받은 문자열을 " "기준으로 잘라서 str배열에 담아주기
        String[] str = s.split(" ");
        // 숫자로 변경시켜서 담기위한 배열
        int[] arr = new int[str.length];
        
        // str배열의 값들을 숫자로 변경시켜 arr배열에 담기
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        // 배열 정렬 (숫자로 되어있기 때문에 오름차순 정렬)
        Arrays.sort(arr);
        
        // 최솟값
        int min = arr[0];
        // 최댓값
        int max = arr[str.length - 1];
        
        // 문자열 형태로 리턴
        return min + " " + max;
    }
}