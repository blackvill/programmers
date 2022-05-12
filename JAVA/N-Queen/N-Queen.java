class Solution {
    static int answer = 0;
    static int[] col;
    static int N;
    
    public int solution(int n) {
        col = new int[n + 1];
        N = n;
		
		setQueens(1);
        return answer;
    }
    
    private static void setQueens(int rowNo) {
		if (rowNo > N) { // 1행부터 쓰니까 (rowNo == n)이면 마지막을 생략한다.
			answer++;
			return;
		}
		// 현재 퀸 1열부터 n열까지 놓아보기
		// 놓았으면 다음 퀸 놓으러 가기
		for (int i = 1; i <= N; i++) {
			col[rowNo] = i;  // i열에 놓기
			if (isAvailable(rowNo)) {
				setQueens(rowNo + 1);
			}
		}
	}
	
	private static boolean isAvailable(int rowNo) { //유효성 검사는 직전 행
		for (int i = 1; i < rowNo; i++) { // i : 이전 퀸
			if (col[rowNo] == col[i] || Math.abs(col[rowNo] - col[i]) == (rowNo - i))
				return false;
		}
		return true;
	}
}