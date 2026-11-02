# 첫 줄: "모델명 연료" (예: "소나타 5" -> model="소나타", fuel=5)
# 둘째 줄: 주행 요청 거리들 (예: "20 15 30" -> [20, 15, 30])
model, fuel = input().split()
fuel = int(fuel)
trips = [int(x) for x in input().split()]


# 자동차 상태 설계도
class Car:
    """자동차 주행 관련을 관리하는 객체입니다."""

    # 생성자: 생성시 모델과 연료 속성 생성
    def __init__(self, model: str, fuel: int) -> None:
        self.model = model
        self.fuel = fuel

    # 주행 객체: 호출시 현재 자동차 객체의 실제 주행거리 및 그에 따른 연료 상태 업데이트
    def drive(self, km: int) -> int:
        """요청 거리(km)만큼 주행하고 실제 주행 거리를 반환합니다."""
        actual_mileage = min(km, self.fuel * 10)
        self.fuel -= actual_mileage // 10
        return actual_mileage

    # 현재 자동차의 모델과 남은 연료를 보여주는 메서드
    def status(self) -> str:
        """현재 모델명과 남은 연료를 문자열로 반환합니다."""
        return f"{self.model} 남은 연료 {self.fuel}"
    

# ---- 호출부 (수정 금지) ----
car = Car(model, fuel)
print(car.status())
for km in trips:
    driven = car.drive(km)
    print(f"요청 {km}km -> 주행 {driven}km")
    print(car.status())