class Solution {
    public int[] solution(int[] sequence, int k) {
       int n = sequence.length;
        int left = 0, right = 0;
        int sum = sequence[0];
        int minLen = Integer.MAX_VALUE;
        int[] answer = {0, 0};

        while (left < n && right < n) {
            if (sum == k) {
                int len = right - left;
                if (len < minLen) {
                    minLen = len;
                    answer[0] = left;
                    answer[1] = right;
                }
                // 왼쪽 줄이기
                sum -= sequence[left++];
            } else if (sum < k) {
                if (++right < n) {
                    sum += sequence[right];
                }
            } else { // sum > k
                sum -= sequence[left++];
            }
        }

        return answer;
    }
}