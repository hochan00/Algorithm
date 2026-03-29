import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 1. 선수들의 이름과 현재 등수를 저장할 HashMap 생성
        HashMap<String, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        // 2. 해설진이 부르는 이름(callings)에 따라 순서 변경
        for (String calling : callings) {
            // 호명된 선수의 현재 등수
            int currentRank = rankMap.get(calling);
            // 바로 앞 선수의 등수
            int frontRank = currentRank - 1;
            
            // 바로 앞 선수의 이름
            String frontPlayer = players[frontRank];
            
            // 3. 배열(players)에서 두 선수의 위치를 Swap(교환)
            players[frontRank] = calling;
            players[currentRank] = frontPlayer;
            
            // 4. HashMap(rankMap)에서도 두 선수의 등수를 갱신
            rankMap.put(calling, frontRank);
            rankMap.put(frontPlayer, currentRank);
        }
        
        // 최종적으로 정렬된 배열 반환
        return players;
    }
}