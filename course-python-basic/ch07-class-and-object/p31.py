# 첫 줄: 요청 수 n. 이어지는 n 줄: "K 3" 또는 "M 1500" (kind 는 'K'/'M', value 는 정수)
n = int(input())
requests = []
for _ in range(n):
    kind, value = input().split()
    requests.append((kind, int(value)))


# 거리 단위를 변환하는 객체 설계도
class Distance:
    """거리 단위 변환기"""

    # 객체를 생성하지 않고 클래스 호출시 매개변수를 직접 받을 수 있도록 설계
    @staticmethod
    def km_to_m(km):
        """km를 m 단위로 변환합니다."""
        return int(km * 1000)

    @staticmethod
    def m_to_km(m):
        """m를 km 단위로 변환합니다."""
        return int(m / 1000)


# ---- 호출부 (수정 금지) ----
conv = Distance()
for kind, value in requests:
    if kind == "K":
        print(Distance.km_to_m(value))           # 클래스 이름으로 직접 호출
    else:
        print(f"{conv.m_to_km(value):.3f}")      # 인스턴스로 호출