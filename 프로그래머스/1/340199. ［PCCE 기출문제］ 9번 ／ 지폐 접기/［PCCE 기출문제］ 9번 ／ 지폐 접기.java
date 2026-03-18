class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int w_min = Math.min(wallet[0], wallet[1]);
        int w_max = Math.max(wallet[0], wallet[1]);
        
        while (Math.min(bill[0], bill[1]) > w_min || Math.max(bill[0], bill[1]) > w_max){
            if(bill[0] > bill[1]){
                bill[0] = bill[0]/2;
                answer += 1;
            }
            else{
                bill[1] = bill[1]/2;
                answer += 1;
            }
        }
        
        return answer;
    }
}