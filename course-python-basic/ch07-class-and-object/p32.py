# 첫 줄: 반지름들 (정수, 공백 구분). 둘째 줄: 새 원주율 값 (실수)
radii = list(map(int, input().split()))
new_pi = float(input())


# 원 클래스
class Circle:
    """원의 넓이를 관리합니다."""

    # 파이의 소수점 개수는 통일시켜야 하므로 클래스 속성으로 저장
    PI = 3.14

    # 생성자: 인스턴스 속성은 캡슐화하여 인스턴스 속성을 외부에서 접근 못하게 저장
    def __init__(self, r):
        self._radius = r

    # 원의 넓이 반환
    def area(self):
        """원의 넓이"""
        return Circle.PI * self._radius ** 2

    # 클래스 속성을 반환하기 위해 클래스 메서드 데코레이터 활용
    @classmethod
    def set_pi(cls, v):
        """PI를 변경합니다."""
        cls.PI = v

    # 정적 메서드를 활용하여 실시간으로 받은 반지름을 활용하여 넓이 반환
    @staticmethod
    def area_of(r):
        """매개변수에 정수를 직접 받아 넓이를 반환합니다."""
        return Circle.PI * r * r


# ---- 호출부 (수정 금지) ----
circles = [Circle(r) for r in radii]
for c in circles:
    print(f"{c.area():.2f}")                     # 인스턴스 메서드
print(f"{Circle.area_of(2):.2f}")                # 정적 메서드 — 클래스 이름으로 호출
Circle.set_pi(new_pi)                            # 클래스 메서드 — 클래스 속성 변경
print("PI:", Circle.PI)
for c in circles:
    print(f"{c.area():.2f}")                     # 기존 원에도 새 PI 가 반영되어야 한다
print(f"{Circle.area_of(2):.2f} {circles[0].area_of(2):.2f}")   # 정적 메서드 — 클래스/인스턴스 호출