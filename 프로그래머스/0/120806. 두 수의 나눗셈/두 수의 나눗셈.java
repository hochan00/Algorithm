class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float n = 0;
        n = (float)num1 / num2;
        answer = (int)(n * 1000);
        return answer;
    }
}