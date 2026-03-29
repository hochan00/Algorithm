class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량
        
        int currentHealth = health; // 현재 체력
        int currentTime = 0;        // 현재 시간
        
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];
            
            // 1. 공격받기 전까지 붕대를 감은 시간 계산
            // (현재 시간과 다음 공격 시간 사이의 빈 시간)
            int timeDiff = attackTime - currentTime - 1;
            
            if (timeDiff > 0) {
                // 기본 회복량 + 추가 회복량 계산
                int heal = timeDiff * x;
                int bonusHeal = (timeDiff / t) * y;
                
                // 체력 회복 (최대 체력을 넘길 수 없음)
                currentHealth += heal + bonusHeal;
                if (currentHealth > health) {
                    currentHealth = health;
                }
            }
            
            // 2. 몬스터의 공격 처리
            currentHealth -= damage;
            
            // 체력이 0 이하가 되면 즉시 사망 처리
            if (currentHealth <= 0) {
                return -1;
            }
            
            // 3. 시간 업데이트
            currentTime = attackTime;
        }
        
        return currentHealth;
    }
}