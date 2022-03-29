class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();

        // 단순 이동만 하는 경우
        int min = len - 1;

        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            // 조이스틱 상, 하 이동
            int mov = (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);
            
            answer += mov;

            // 조이스틱 좌, 우 이동
            int idx = i + 1;
            // 이름에 A가 들어가면 기본 값으로 넘어가면 되므로
            // 인덱스 값만 증가
            while (idx < len && name.charAt(idx) == 'A')
                idx++;

            // 그냥 이동하는 경우
            // 현재 위치에서 오른쪽으로 이동 후 글자를 바꾸고 다시 돌아오는 경우
            // 현재 위치에서 왼쪽으로 이동 후 글자를 바꾸고 다시 돌아오는 경우
            min = Math.min(min, Math.min((i * 2) + len - idx, (len - idx) * 2 + i));
        }

        answer += min;
        
        return answer;
    }
}