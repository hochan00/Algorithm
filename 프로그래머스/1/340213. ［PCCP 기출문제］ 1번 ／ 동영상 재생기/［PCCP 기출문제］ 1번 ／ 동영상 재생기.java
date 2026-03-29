class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 1. 모든 시간을 계산하기 쉽게 '초' 단위로 변환
        int videoLenSec = timeToSec(video_len);
        int currentSec = timeToSec(pos);
        int opStartSec = timeToSec(op_start);
        int opEndSec = timeToSec(op_end);

        // 2. 명령어 수행 전, 현재 위치가 오프닝 구간인지 확인 (매우 중요!)
        if (currentSec >= opStartSec && currentSec <= opEndSec) {
            currentSec = opEndSec;
        }

        // 3. 명령어 순차적으로 수행
        for (String command : commands) {
            if (command.equals("prev")) {
                currentSec = Math.max(0, currentSec - 10); // 0초 밑으로 안 내려가게 방어
            } else if (command.equals("next")) {
                currentSec = Math.min(videoLenSec, currentSec + 10); // 영상 길이 안 넘어가게 방어
            }

            // 4. 이동한 후의 위치가 오프닝 구간인지 다시 확인
            if (currentSec >= opStartSec && currentSec <= opEndSec) {
                currentSec = opEndSec;
            }
        }

        // 5. 최종 계산된 '초'를 다시 "mm:ss" 문자열 포맷으로 변환하여 반환
        return String.format("%02d:%02d", currentSec / 60, currentSec % 60);
    }

    // "mm:ss" 문자열을 받아 총 '초'로 변환해 주는 헬퍼 메서드
    private int timeToSec(String time) {
        String[] t = time.split(":");
        int m = Integer.parseInt(t[0]);
        int s = Integer.parseInt(t[1]);
        return m * 60 + s;
    }
}