# 첫 줄: 요청 수 n. 이어지는 n 줄: "이름" 또는 "이름 인사말" (예: "이영희 반갑습니다" -> ["이영희", "반갑습니다"])
n = int(input())
requests = [input().split() for _ in range(n)]

# 기본값 매개변수를 사용하여 오버로딩 구현
class Greeter:
    """인사말 생성기"""

    def greet(self, name: str, greeting: str = "안녕하세요") -> str:
        """이름과 인사말을 반환합니다."""
        return f"{greeting}, {name}님"

# ---- 호출부 (수정 금지) ----
g = Greeter()
for req in requests:
    if len(req) == 1:
        print(g.greet(req[0]))                 # 인사말 생략 → 기본값 사용
    else:
        print(g.greet(req[0], req[1]))         # 인사말 지정