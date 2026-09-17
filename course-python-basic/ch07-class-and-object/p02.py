class TempConverter:
    """섭씨-화씨 간 온도 변환 유틸리티 클래스."""

    @staticmethod
    def c_to_f(c):
        """섭씨를 화씨로 변환합니다."""
        return c * 9 / 5 + 32

    @staticmethod
    def f_to_c(f):
        """화씨를 섭씨로 변환합니다."""
        return (f - 32) * 5 / 9


# 첫 줄: 요청 수 n. 이어지는 n 줄: "C 25" 또는 "F 77" (kind 는 'C'/'F', value 는 실수로 변환)
n = int(input())
requests = []
for _ in range(n):
    kind, value = input().split()
    requests.append((kind, float(value)))

# ---- 호출부 (수정 금지) ----
conv = TempConverter()
for kind, value in requests:
    if kind == "C":
        print(f"{TempConverter.c_to_f(value):.1f}")   # 클래스 이름으로 직접 호출
    else:
        print(f"{conv.f_to_c(value):.1f}")            # 인스턴스로 호출