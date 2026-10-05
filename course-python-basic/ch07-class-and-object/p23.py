# 첫 줄: 명령 수 n. 이어지는 n 줄: "add sensor" / "prefix IOT-" (공백으로 split 한 리스트)
n = int(input())
commands = [input().split() for _ in range(n)]


# 장치 설계도
class Device:
    """장치 ID 발급 관련 클래스입니다."""

    # 클래스 속성
    prefix = "DV-"
    next_no = 1

    # 생성자
    def __init__(self, kind: str) -> None:
        self.kind = kind
        self.uid = f"{self.__class__.prefix}{self.__class__.next_no:03d}"
        Device.next_no += 1

    # 라벨 문자열 반환
    def label(self) -> str:
        """호출하면 라벨을 반환합니다."""
        return f"[{self.uid}] {self.kind}"


# ---- 호출부 (수정 금지) ----
devices = []
for cmd in commands:
    if cmd[0] == "add":
        d = Device(cmd[1])
        devices.append(d)
        print(d.label())
    else:
        Device.prefix = cmd[1]
        print([d.label() for d in devices])   # 기존 장치의 ID 는 그대로여야 한다
        print("접두사 변경:", Device.prefix)
print(Device.next_no)
print([d.uid for d in devices])
print("next_no" in devices[0].__dict__, "prefix" in devices[0].__dict__)