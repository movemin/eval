# 첫 줄: 쌍의 수 n. 이어지는 n 줄: "x1 y1 x2 y2" (예: "0 0 4 4" -> [0, 0, 4, 4])
n = int(input())
rows = [list(map(int, input().split())) for _ in range(n)]


# 점 클래스
class Point:
    """점의 좌표를 관리하는 클래스"""

    # 생성자
    def __init__(self, x: int, y: int):
        self._x = x     # 캡슐화하여 객체의 속성 보호
        self._y = y

    # 비파괴적 이념에 따라 속성을 읽을 때 파이썬 변수답게 읽게 설계
    @property
    def x(self):
        return self._x
        
    @property
    def y(self):
        return self._y

    # 좌표 현황 읽기
    def show(self) -> str:
        """좌표 현황을 보여줍니다."""
        return f"({self.x}, {self.y})"

    # 두 점 사이 거리의 제곱들의 합 반환
    def dist2(self, other) -> int:
        """두 점 사이 거리의 제곱의 합을 반환합니다."""
        return (self.x - other.x) ** 2 + (self.y - other.y) ** 2

    # 중점 반환
    def midpoint(self, other):
        """중점을 반환합니다."""
        mid_x = (self.x + other.x) / 2
        mid_y = (self.y + other.y) / 2
        return Point(mid_x, mid_y)


# ---- 호출부 (수정 금지) ----
for x1, y1, x2, y2 in rows:
    p, q = Point(x1, y1), Point(x2, y2)
    print("dist2:", p.dist2(q))
    m = p.midpoint(q)
    print("mid:", m.show())
    print("orig:", p.show(), q.show())   # 원래 점은 그대로여야 한다