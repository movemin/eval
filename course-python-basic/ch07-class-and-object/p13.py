# 첫 줄: 상자 수 n. 이어지는 n 줄: "가로 세로 높이" (예: "2 3 4" -> [2, 3, 4])
n = int(input())
rows = [list(map(int, input().split())) for _ in range(n)]


# 상자 클래스
class Box:
    """직육면체 상자를 나타내는 클래스."""

    # 생성자: 가로, 세로, 높이 저장
    def __init__(self, width, height, depth):
        self._width = width   # 보안을 위해 캡슐화
        self._height = height
        self._depth = depth
    
    # 비파괴적으로 속성을 읽는 메서드 작성 -> 객체.메서드 입력하면 읽을 수 있도록 설계
    @property
    def width(self):
        return self._width

    @property
    def height(self):
        return self._height

    @property
    def depth(self):
        return self._depth
    
    # 부피: 가로 x 세로 x 높이
    def volume(self):
        """부피를 반환합니다."""
        return self._width * self._height * self._depth

    # 겉넓이: 2 * (가로x세로 + 세로x높이 + 가로x높이)
    def surface(self):
        """겉넓이를 반환합니다."""
        return 2 * (self._width * self._height + self._height * self._depth + self._width * self._depth)
    
    # 상자의 상태
    def describe(self):
        """상자가 가지고 있는 값의 현황을 반환합니다."""
        return f"{self._width}x{self._height}x{self._depth}: 부피 {self.volume()}, 겉넓이 {self.surface()}"

    # 디버깅시 상태를 확인할 수 있는 코드 작성
    def __repr__(self):
        return f"Box({self._width}, {self._height}, {self._depth})"


# ---- 호출부 (수정 금지) ----
for w, h, d in rows:
    box = Box(w, h, d)
    print(box.volume())
    print(box.surface())
    print(box.describe())