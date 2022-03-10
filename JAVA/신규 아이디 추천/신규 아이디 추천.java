class Solution {
    public String solution(String new_id) {
        // 1. 소문자로 만들기
        new_id = new_id.toLowerCase();
        
        String id = "";
        // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            
            if (c >= 'a' && c <= 'z')
                id += String.valueOf(c);
            else if (c >= '0' && c <= '9')
                id += String.valueOf(c);
            else if (c == '-' || c == '_' || c == '.')
                id += String.valueOf(c);
        }
        
        // 3. 마침표가 2번이상 연속된 부분을 하나의 마침표로 치환
        while (id.contains(".."))
            id = id.replace("..", ".");

        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (id.startsWith(".") ) {
			id = id.substring(1, id.length());
		}
        if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}

        // 5. 빈 문자열이라면 a대입
        if (id.length() == 0)
            id = "a";
        
        // 6. 길이가 16자 이상이라면 처음 15개를 제외한 나머지 문자 제거
        if (id.length() >= 16)
            id = id.substring(0, 15);

        // 6-2. 만약 제거 후 마침표가 마지막에 있다면 마지막 .을 제거
        if (id.endsWith("."))
			id = id.substring(0, id.length() - 1);

        // 7. 길이가 2글자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복
        String last = id.charAt(id.length() - 1) + "";
        if (id.length() <= 2)
            while (id.length() != 3)
                id += last;
        
        return id;
    }
}