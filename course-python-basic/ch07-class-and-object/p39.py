# 첫 줄: 전등 이름들 (예: "거실 주방" -> ["거실", "주방"]). 둘째 줄: 명령 수 n. 이어지는 n 줄: "on 거실" / "off 거실"
names = input().split()
n = int(input())
commands = [input().split() for _ in range(n)]


class Lamp:
    """이름과 켜짐/꺼짐 상태를 관리하는 전등 클래스."""

    def __init__(self, name):
        self.name = name  # 인스턴스 속성으로 저장
        self.on = False   # 초기 상태: 꺼짐

    def turn_on(self):
        self.on = True

    def turn_off(self):
        self.on = False

    def status(self):
        state = "켜짐" if self.on else "꺼짐"
        return f"{self.name}: {state}"


# ---- 호출부 (수정 금지) ----
lamps = {name: Lamp(name) for name in names}
for cmd, name in commands:
    if cmd == "on":
        lamps[name].turn_on()                # 인스턴스로 호출 → self 자동 전달
    else:
        Lamp.turn_off(lamps[name])           # 클래스로 호출 → self 를 직접 전달
for name in names:
    print(lamps[name].status())