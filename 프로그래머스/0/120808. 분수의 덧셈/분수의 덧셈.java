import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        List<Integer> list = new ArrayList<>();
        int numer3 = 0;
        int denom3 = 0;
        
        numer3 = numer1 * denom2 + numer2 * denom1;
        denom3 = denom1 * denom2;
        
        int max = 1;
        if(numer3 > denom3){
            for(int i=1; i <= denom3; i++){
                if(numer3%i==0 && denom3%i==0){
                    max = i;
                }
            }
            list.add(numer3 / max);
            list.add(denom3 / max);
        }
        else{
            for(int i=1; i<=numer3; i++){
                if(numer3%i==0 && denom3%i==0){
                    max = i;
                }
            }
            list.add(numer3 / max);
            list.add(denom3 / max);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}