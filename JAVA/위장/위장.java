import java.util.;

class Solution {
    public int solution(String[][] clothes) {
        
        HashMapString, Integer map = new HashMap();
        
        for (String[] str  clothes) {
            String type = str[1];
            
            if (map.containsKey(type))
                map.put(type, map.get(type) + 1);
            else
                map.put(type, 1);
        }
        
        IteratorInteger it = map.values().iterator();
        
        int answer = 1;
        
        while(it.hasNext())
            answer = it.next().intValue() + 1;
        
        return answer - 1;
    }
}