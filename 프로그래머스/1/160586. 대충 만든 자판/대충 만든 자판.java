import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 1. 각 문자가 나올 수 있는 최소 클릭 횟수를 저장할 맵
        HashMap<Character, Integer> minKeys = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int count = i + 1; // 클릭 횟수는 인덱스 + 1

                // 문자가 맵에 없거나, 현재 클릭 횟수가 기존보다 작으면 갱신
                if (!minKeys.containsKey(c) || count < minKeys.get(c)) {
                    minKeys.put(c, count);
                }
            }
        }

        int[] answer = new int[targets.length];

        // 2. 타겟 문자열을 돌며 총 합산 계산
        for (int i = 0; i < targets.length; i++) {
            int total = 0;
            boolean possible = true;

            for (char targetChar : targets[i].toCharArray()) {
                if (minKeys.containsKey(targetChar)) {
                    total += minKeys.get(targetChar);
                } else {
                    // 키맵에 없는 문자가 하나라도 있으면 -1 처리
                    possible = false;
                    break;
                }
            }

            answer[i] = possible ? total : -1;
        }

        return answer;
    }
}