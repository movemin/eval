# 한 줄에 이름들이 공백으로 구분되어 있습니다. 예: "kim lee kim" -> ["kim", "lee", "kim"]
names = input().split()


# 티켓을 관리하기 위해 마지막 소지자와 누적 카운트로 추상화하여 설계
class Ticket:
    """티켓 발급 관리 클래스"""

    # 발급 수와 마지막 소지자는 공유하기 때문에 클래스 메모리에 저장
    issued = 0
    last_holder = None

    # 생성자 -> 생성되면 발급 수와 마지막 소지자 업데이트
    def __init__(self, holder: str):
        Ticket.issued += 1                  # 클래스명으로 직접 갱신 — 더 간결하고 의도가 명확
        self._no = Ticket.issued            # 증가 후 값을 인스턴스에 저장
        self._holder = holder
        Ticket.last_holder = holder

    # 발급자의 발급 번호와 이름 반환
    def label(self) -> str:
        """현재 발급자의 번호와 성함을 반환합니다."""
        return f"T{self._no:02d} {self._holder}"


# ---- 호출부 (수정 금지) ----
print(Ticket.issued, Ticket.last_holder)          # 발급 전
tickets = [Ticket(name) for name in names]
for t in tickets:
    print(t.label())
print(Ticket.issued, Ticket.last_holder)          # 발급 후
print("issued" in tickets[0].__dict__, "last_holder" in tickets[0].__dict__)