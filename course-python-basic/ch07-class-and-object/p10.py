# 첫 줄: "시 분" (예: "9 30" -> h=9, m=30)
# 둘째 줄: 진행시킬 분들 (예: "15 45" -> [15, 45])
h, m = [int(x) for x in input().split()]
ticks = [int(x) for x in input().split()]


# 시간을 넘기는 시계 클래스 설계도
class Clock:
    """시간을 넘기는 시계"""

    # 생성자
    def __init__(self, h: int, m: int) -> None:
        self.h = h
        self.m = m
    
    # 시간 업데이트 메서드
    def tick(self, minutes: int) -> None:
        """현재 객체에 저장되어 있는 분을 업데이트 해줍니다."""
        total_minutes = self.h * 60 + self.m + minutes
        self.h = (total_minutes // 60) % 24
        self.m = total_minutes % 60

    # 현재 시간을 반환하는 메서드
    def show(self) -> str:
        """HH:MM 형식으로 시간을 반환합니다."""
        return f"{self.h:02}:{self.m:02}"


# ---- 호출부 (수정 금지) ----
clock = Clock(h, m)
print(clock.show())
for minutes in ticks:
    clock.tick(minutes)
    print(f"+{minutes}분 -> {clock.show()}")