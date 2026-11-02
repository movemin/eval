# 첫 줄: 요청 수 n. 이어지는 n 줄: "1000" 또는 "1000 5" (예: "1000 5" -> ["1000", "5"])
n = int(input())
requests = [input().split() for _ in range(n)]


# 수수료 계산 클래스
class Fee:
    """수수료 계산기 객체를 생성합니다."""

    # 오버로딩을 가변인자로 대체하여 매개변수의 개수를 유연하게 대처
    def calc(self, amount: int, rate: int = 10) -> int:  # 매개변수의 정의 순서: 위치인자가 맨 앞, 그 다음 기본값 매개변수
        """수수료 계산한 최종 금액을 반환합니다."""
        return amount * rate // 100


# ---- 호출부 (수정 금지) ----
f = Fee()
for req in requests:
    if len(req) == 1:
        print(f.calc(int(req[0])))                       # 수수료율 생략 → 기본 10%
    else:
        print(f.calc(int(req[0]), rate=int(req[1])))     # 수수료율을 키워드 인자로 지정