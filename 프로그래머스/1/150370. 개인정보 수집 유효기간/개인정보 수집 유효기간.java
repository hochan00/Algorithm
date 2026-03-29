import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        
        // 1. 오늘 날짜를 총 '일(Day)' 수로 변환
        int todayDays = dateToDays(today);
        
        // 2. 약관(terms) 정보를 HashMap에 저장 (약관 종류 -> 보관 가능 '일' 수)
        for (String term : terms) {
            String[] split = term.split(" ");
            String type = split[0];
            int durationDays = Integer.parseInt(split[1]) * 28; // 한 달을 28일로 계산
            termMap.put(type, durationDays);
        }
        
        // 3. 각 개인정보(privacies)의 파기 여부 계산
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String date = split[0];
            String type = split[1];
            
            int collectedDays = dateToDays(date);
            int expirationDays = collectedDays + termMap.get(type); // 파기해야 하는 날짜
            
            // 오늘 날짜가 파기해야 하는 날짜와 같거나 그 이후라면 파기 대상
            if (todayDays >= expirationDays) {
                answerList.add(i + 1); // 번호는 1번부터 시작하므로 i + 1
            }
        }
        
        // 4. List를 int[] 배열로 변환하여 반환
        return answerList.stream().mapToInt(i -> i).toArray();
    }
    
    // "YYYY.MM.DD" 포맷의 날짜를 총 '일(Day)' 수로 변환하는 헬퍼 메서드
    private int dateToDays(String date) {
        String[] split = date.split("\\.");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        
        // 1년을 12달, 1달을 28일로 치환하여 모두 더함
        return (year * 12 * 28) + (month * 28) + day;
    }
}