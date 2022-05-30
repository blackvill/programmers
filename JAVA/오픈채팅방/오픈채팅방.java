import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0; i < record.length; i++) {
            String str[] = record[i].split(" ");
            
            if (str[0].equals("Enter")) {
                map.put(str[1], str[2]);
                list.add(str[1] + "님이 들어왔습니다.");
            }
            else if (str[0].equals("Leave")) {
                list.add(str[1] + "님이 나갔습니다.");
            }
            else if (str[0].equals("Change")) {
                map.replace(str[1], str[2]);
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            // id를 구하기 위해 0부터 indexOf("님")까지 substring
            int index = list.get(i).indexOf("님");
            String id = list.get(i).substring(0, index);
            
            // id와 뒤의 내용을 추가해서 담아주기
            answer[i] = map.get(id) + list.get(i).substring(index);
        }
        
        return answer;
    }
}