class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int num = 0;
        
        for (int i = 0; i < number.length() - k; i++) {
            num = 0;
            
            for (int j = idx; j <= i + k; j++) {
                if (num < number.charAt(j) - '0') {
                    num = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }
            sb.append(num);
        }
        
        return sb.toString();
    }
}