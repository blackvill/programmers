class Solution {
    public int[] solution(String s) {
        int count = 0; // 변환 횟수
        int zero = 0; // 0 횟수
        int[] answer = new int[2];
        
        // 문자열이 1이 될 때 까지 반복
        while (s.compareTo("1") != 0) {
            String word = ""; // 변환된 문자
            
            // s의 길이만큼 체크
            for (int i = 0; i < s.length(); i++) {
                // 각 부분을 잘라서 체크할 것
                char c = s.charAt(i);
                
                // 0이면
                if (c == '0') {
                    zero++; // 0 횟수 증가
                }
                // 0이 아니면
                else
                    word += c; // 변환된 문자에 추가
            }
            
            // 0을 제거하고 만들어진 새 문자의 길이를 2진수 변환
            // Integer.toBinaryString(int num); ==> 2진수로 변환해줌
            s = Integer.toBinaryString(word.length());
            // 변환 횟수 증가
            count++;
        }
        
        // 결과 담아주기
        answer[0] = count;
        answer[1] = zero;
        
        return answer;
    }
}