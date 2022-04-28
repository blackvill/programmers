class Solution {
    public String solution(String s) {
        String answer = "";
        // 각 단어의 첫글자만 제외하고는 소문자이므로
        // 전체를 소문자로 먼저 만들어준다.
        // 문자열 공백을 기준으로 잘라서 넣기
        String[] str = s.toLowerCase().split("");
        // 이전이 공백인지 체크
        boolean space = true;

        for(String ss : str) {
            // space가 true면 대문자로, 아니면 그냥 그대로 사용
            answer += space ? ss.toUpperCase() : ss;
            // 공백이 오면 space를 true 아니면 false
            space = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}