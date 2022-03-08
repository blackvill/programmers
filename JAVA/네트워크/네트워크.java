public class Solution {
    public int solution(int n, int[][] computers) {
	    int answer = 0;
	    boolean[] visited = new boolean[n];

	    for (int i = 0; i  n; i++) {
             탐색하지 않은 것
		    if (visited[i] == false) {
                dfs(i, visited, computers);
			    answer++;
		    }
	    }

	    return answer;
	}

	public void dfs(int node, boolean[] visited, int[][] computers) {
		visited[node] = true;

		for (int i = 0; i  computers.length; i++) {
             방문하지 않은곳이고 연결된 곳이라면
			if (visited[i] == false && computers[node][i] == 1) {
				dfs(i, visited, computers);
			}
		}
	}
}