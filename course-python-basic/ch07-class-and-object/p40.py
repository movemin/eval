# 첫 줄: "주차장이름 수용대수". 둘째 줄: 명령 수 n. 이어지는 n 줄: "park 123-4567" / "leave 123-4567 3" / "fee 2000" / "check 12-34567" / "count"
lot_name, capacity = input().split()
n = int(input())
commands = [input().split() for _ in range(n)]


# 주차장을 관리할 클래스를 설계
class ParkingLot:
    """주차장 관리 클래스"""

    # 클래스 속성: 모든 주차장이 공유
    fee_per_hour: int = 1000

    # 생성자: 주차장 이름, 수용 대수 인스턴스 속성으로 저장
    def __init__(self, name: str, capacity: int) -> None:
        self.name = name
        self.capacity = capacity
        self.plates: set = set()

    # 클래스 메서드 셋터
    @classmethod
    def set_fee(cls, v: int) -> None:
        """시간당 요금을 업데이트 합니다."""
        cls.fee_per_hour = v

    # 정적 메서드로 번호판 유효 확인
    @staticmethod
    def is_valid_plate(s: str) -> bool:
        """번호판이 유효한지 확인합니다."""
        return len(s) == 8 and s[3] == '-' and s[:3].isdigit() and s[4:].isdigit()

    # 입차
    def park(self, plate: str) -> bool:
        """입차 유효성 검사 및 번호판 형식 유효성 검사 후 주차시킵니다."""
        
        # 형식 검사
        if not type(self).is_valid_plate(plate):
            return False
        
        # 주차장 대수 확인
        if len(self.plates) >= self.capacity:
            return False

        # 주차장 현황 업데이트
        self.plates.add(plate)
        
        return True

    # 출차
    def leave(self, plate: str, hours: int) -> int:
        """출차를 관리합니다."""
        if plate not in self.plates:
            return -1
        self.plates.remove(plate)
        fee = hours * type(self).fee_per_hour
        return fee
    
    # 주차된 차의 대수
    def count(self) -> int:
        """주차된 차의 대수를 반환합니다."""
        return len(self.plates)


# ---- 호출부 (수정 금지) ----
lot = ParkingLot(lot_name, int(capacity))
for cmd in commands:
    if cmd[0] == "park":
        print("입차", cmd[1], lot.park(cmd[1]))
    elif cmd[0] == "leave":
        print("출차", cmd[1], lot.leave(cmd[1], int(cmd[2])))
    elif cmd[0] == "fee":
        ParkingLot.set_fee(int(cmd[1]))
        print("요금 변경:", ParkingLot.fee_per_hour)
    elif cmd[0] == "check":
        print("형식", cmd[1], ParkingLot.is_valid_plate(cmd[1]))
    else:
        print("주차 대수:", lot.count())
print(f"{lot.name} 최종 {lot.count()}/{lot.capacity}")