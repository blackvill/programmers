class Solution {
     static int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs (int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {   
            if(sum == target)
                answer++;
            return;
        }
        
        // 뺏을때
        sum += (-1 * numbers[index]);
        dfs(numbers, target , index + 1, sum);
        
        // 더했을 때
        sum += numbers[index] * 2; // 이전에 뺐던거를 더해주기 위해 * 2
        dfs(numbers, target, index + 1, sum);
        
    }
}