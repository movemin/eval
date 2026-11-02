# 첫 줄: 계량기 수 n. 이어지는 n 줄: "소유자 사용량1 사용량2 ..." (예: "kim 10 20" -> ["kim", "10", "20"])
n = int(input())
rows = [input().split() for _ in range(n)]


class Meter:
    total_units = 0

    def __init__(self, owner):
        self.owner = owner
        self.reading = 0

    def add(self, units):
        self.reading += units      # 오타 대입은 새 속성을 만들고 self.reading은 0 그대로 남음
        Meter.total_units += units
        return self.reading

    def report(self):
        return f"{self.owner}: {self.reading}kWh"


# ---- 호출부 (수정 금지) ----
meters = []
for row in rows:
    m = Meter(row[0])
    for units in row[1:]:
        print(m.add(int(units)))
    meters.append(m)
for m in meters:
    print(m.report())
print(Meter.total_units)
print("readng" in meters[0].__dict__, sorted(meters[0].__dict__) == ["owner", "reading"])