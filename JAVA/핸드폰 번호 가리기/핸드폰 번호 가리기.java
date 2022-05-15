class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 4글자 전까지 *로 찍기
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        // 마지막 4글자는 그냥 입력
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }
        
        return answer;
    }
}