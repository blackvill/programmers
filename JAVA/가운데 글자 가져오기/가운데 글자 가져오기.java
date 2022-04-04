class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열 반 잘라서 해당 위치 출력하기
        // 최대 2글자니까 a~b까지로 지정해주기 위해 substring(a,b)로 사용
        // 전체에서 반 ~ 반 + 1 사이
        // 홀수라면 가운데만
        // 짝수라면 가운데를 기준으로 왼쪽 오른쪽 1개씩해서 2글자
        return answer = s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}