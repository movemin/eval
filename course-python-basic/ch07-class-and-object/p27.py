# 첫 줄: 날짜 수 n. 이어지는 n 줄: "2026-08-24" (문자열 형식) 또는 "2026 8 24" (정수 3개 형식)
n = int(input())
lines = [input().strip() for _ in range(n)]


# 날짜 클래스
class Date:
    """날짜를 관리합니다."""

    # 생성자
    def __init__(self, y, m, d):
        # 캡슐화
        self.y = y
        self.m = m
        self.d = d

    # 대체 생성자
    @classmethod
    def from_string(cls, s):
        """대체 생성자입니다."""
        return cls(*map(int, s.split("-")))     # 요소를 정수로 바꿔 가변 인자로 전달

    # 날짜 클래스 속성 반환
    def show(self):
        """'{y}년 {m}월 {d}일' 형식으로 반환합니다."""
        return f"{self.y}년 {self.m}월 {self.d}일"


# ---- 호출부 (수정 금지) ----
for line in lines:
    if "-" in line:
        date = Date.from_string(line)              # 문자열 → 대체 생성자(클래스 메서드)
        print(type(date).__name__, date.show())
    else:
        y, m, d = map(int, line.split())
        date = Date(y, m, d)                       # 기본 생성자
        print(date.show())