class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder(); // 문자열을 붙일 연습장
        
        // 시작 위치 (*은 10, 0은 11, #은 12로 치환)
        int leftPos = 10;
        int rightPos = 12;

        for (int num : numbers) {
            if (num == 0) num = 11; // 0은 계산을 위해 11로 변경

            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                leftPos = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rightPos = num;
            } else {
                // 가운데 열(2, 5, 8, 11)일 경우 거리 계산
                int leftDist = getDist(leftPos, num);
                int rightDist = getDist(rightPos, num);

                if (leftDist < rightDist) {
                    sb.append("L");
                    leftPos = num;
                } else if (leftDist > rightDist) {
                    sb.append("R");
                    rightPos = num;
                } else { // 거리가 같을 때
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftPos = num;
                    } else {
                        sb.append("R");
                        rightPos = num;
                    }
                }
            }
        }
        return sb.toString();
    }

    // 두 숫자 사이의 거리를 구하는 메서드
    private int getDist(int pos, int target) {
        // (숫자 - 1)을 3으로 나눈 몫은 행(Y), 나머지는 열(X)이 됩니다.
        int posRow = (pos - 1) / 3;
        int posCol = (pos - 1) % 3;
        int targetRow = (target - 1) / 3;
        int targetCol = (target - 1) % 3;

        // X 좌표의 차이와 Y 좌표의 차이를 절댓값으로 더함
        return Math.abs(posRow - targetRow) + Math.abs(posCol - targetCol);
    }
}