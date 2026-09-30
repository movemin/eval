# 첫 줄: 센서 이름들 (예: "temp humid" -> ["temp", "humid"])
# 둘째 줄: 기록 수 n. 이어지는 n 줄: "센서이름 측정값" (예: "temp 20" -> ("temp", 20))
names = input().split()
n = int(input())
records = []
for _ in range(n):
    name, value = input().split()
    records.append((name, int(value)))


# 센서 기록 클래스
class Sensor:
    """센서를 관리하는 프로그램"""

    # 생성자
    def __init__(self, name: str) -> None:
        self.name = name
        self.readings = []

    # 센서에 입력한 기록 저장
    def record(self, value: int) -> None:
        """기록 저장"""
        self.readings.append(value)

    # 센서에 저장한 기록들의 개수 반환
    def count(self) -> int:
        """기록 개수"""
        return len(self.readings)

    # 평균 반환
    def average(self) -> float:
        """각 센서에 저장된 기록들의 평균"""
        if self.readings:
            return sum(self.readings) / self.count()
        return 0.0


# ---- 호출부 (수정 금지) ----
sensors = {name: Sensor(name) for name in names}
for name, value in records:
    sensors[name].record(value)
for name in names:
    s = sensors[name]
    print(f"{s.name} {s.count()}개 평균 {s.average():.1f}")