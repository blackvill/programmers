import java.io.*;
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        // 문자열로 담을 배열
        String[] str = new String[numbers.length];
        
        //int배열 String배열로 변환
        for(int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }     
        
        // 내림차순 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 두 수를 합쳐서 더 큰 값을 구하기
                // ex) 10, 15 >> 1015 vs 1510
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        // 배열 값 확인 체크
        // for (String s : str)
        //     System.out.println(s);
        
        // 처음이 0이면 안되므로 예외처리
        if (str[0].equals("0"))
            return "0";
        // 0이 아니라면 처음부터 끝까지 전부 더하기
        for(String s : str)
            answer += s;
 
        return answer;
    }
}