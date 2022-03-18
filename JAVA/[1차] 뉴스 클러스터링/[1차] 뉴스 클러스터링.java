import java.io.*;
import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        // 1번 문자열 쪼개서 담을 리스트
        ArrayList<String> A = new ArrayList<>();
        // 2번 문자열 쪼개서 담을 리스트
        ArrayList<String> B = new ArrayList<>();

        // 합집합
        ArrayList<String> plus = new ArrayList<>();
        // 교집합
        ArrayList<String> same = new ArrayList<>();
        
        // 대소문자 무시 == 둘 다 같은 형태로 바꿔주기
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
      
        for (int i = 0 ; i < str1.length() - 1 ; i++) {
            char c = str1.charAt(i);
            char ch = str1.charAt(i + 1);
            
            // 대문자가 아니면 영단어가 아니므로 체크
            if (c >= 'A' && c <= 'Z' && ch >= 'A' && ch <= 'Z') {
                String s = c + " " + ch;
                // 두 글자씩 잘라서 넣기
                A.add(s);
            }
        }
      
        for (int i = 0 ; i < str2.length() - 1 ; i++) {
            char c = str2.charAt(i);
            char ch = str2.charAt(i + 1);

            // 대문자가 아니면 영단어가 아니므로 체크
            if (c >= 'A' && c <= 'Z' && ch >= 'A' && ch <= 'Z') {
                String s = c + " " + ch;
                // 두 글자씩 잘라서 넣기
                B.add(s);
            }
        }
        
        // 모든 A에 있는 모든 단어 체크
        for (String s : A) {
            // 합집합
            plus.add(s);
            
            // 해당 단어가 있어서 B에서 제거되면 true 리턴
            // 아니면 false 리턴
            if (B.remove(s)) {
                // 있는거니까 중복된다는 소리
                // 그럼 교집합
                same.add(s);
            }
        }
      
        for (String s : B) {
            // B에서 교집합 빼고나서 남은 것들 합집합에 넣어주기
            plus.add(s);
        }
        
        // 소수가 담기니까 double형
        double answer = 0;
        
        // 합집합의 크기가 0이다 == 둘 다 공집합이다
        if (plus.size() == 0) {
              answer = 1;
        } else {
            answer = (double)same.size() / (double)plus.size();
        }
            
        return (int)(answer * 65536);
    }
}