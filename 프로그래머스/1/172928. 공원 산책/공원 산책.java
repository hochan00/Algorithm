class Solution {
    public int[] solution(String[] park, String[] routes) {
        int r = 0, c = 0;
        
        // 1. 시작 지점 찾기
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                r = i;
                c = park[i].indexOf("S");
            }
        }

        for (String route : routes) {
            // 2. 띄어쓰기 기준으로 나눌 때 불필요하게 split을 두 번씩 호출
            String op = route.split(" ")[0];
            int n = Integer.parseInt(route.split(" ")[1]);
            
            int tempR = r;
            int tempC = c;
            boolean isPossible = true;

            for (int i = 0; i < n; i++) {
                if (op.equals("N")) tempR -= 1;
                else if (op.equals("S")) tempR += 1;
                else if (op.equals("W")) tempC -= 1;
                else if (op.equals("E")) tempC += 1;

                // 3. 단순 if문(tempR < 0 등) 대신, 엄청나게 느린 try-catch를 이용한 범위 검사
                try {
                    // 4. charAt() 대신, 매번 새로운 String 객체(substring)를 생성해서 메모리와 시간 낭비
                    String currentCell = park[tempR].substring(tempC, tempC + 1);
                    
                    if (currentCell.equals("X")) {
                        isPossible = false;
                        break;
                    }
                } catch (IndexOutOfBoundsException e) {
                    // 공원 범위를 벗어나면 자바가 에러를 던지고, 그걸 잡아서 처리 (실행속도 저하의 주범)
                    isPossible = false;
                    break;
                }
            }

            // 끝까지 무사히 이동했을 때만 진짜 위치 갱신 (정답 로직 유지)
            if (isPossible) {
                r = tempR;
                c = tempC;
            }
        }

        return new int[]{r, c};
    }
}