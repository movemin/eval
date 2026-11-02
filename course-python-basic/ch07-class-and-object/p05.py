# 첫 줄: 명령 수 n. 이어지는 n 줄: "rect 3" / "rect 3 4" / "unit m" (공백으로 split 한 리스트)
n = int(input())
commands = [input().split() for _ in range(n)]

# 사각형을 관리하는 클래스
class Rect:
    """사각형을 관리하는 객체입니다."""
    
    # 단위는 클래스 속성 -> 모든 인스턴스가 공유하여 사용하는 것은 유지보수성을 높인다
    unit = "cm"

    # 생성자: 파라미터가 하나면 정사각형으로 취급
    def __init__(self, w, h=None):
        self.w = w
        if h is None:
            self.h = w
        else:
            self.h = h

    # 넓이를 구하는 메서드
    def area(self):
        return self.w * self.h

    # 현재 사각형 상태를 반환하는 메서드
    def describe(self):
        return f"{self.w}x{self.h} {type(self).unit}, 넓이 {self.w * self.h}"

    # 단위 바꾸는 메서드
    @classmethod
    def set_unit(cls, u):
        cls.unit = u


# ---- 호출부 (수정 금지) ----
rects = []
for cmd in commands:
    if cmd[0] == "rect":
        r = Rect(int(cmd[1])) if len(cmd) == 2 else Rect(int(cmd[1]), int(cmd[2]))
        rects.append(r)
        print(r.describe())
    else:
        Rect.set_unit(cmd[1])
        print("단위 변경:", Rect.unit)
        for r in rects:
            print(r.describe())