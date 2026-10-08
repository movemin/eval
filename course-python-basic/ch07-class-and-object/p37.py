# 첫 줄: 명령 수 n. 이어지는 n 줄: "new kim" / "borrow kim 3" / "info kim" (공백으로 split 한 리스트)
n = int(input())
commands = [input().split() for _ in range(n)]


# 도서관 대출자
class Borrower:
    """도서관 대출을 관리합니다"""

    # 총 대출자수와 대출한도는 공유하기 위해 클래스 속성으로 선언
    total: int = 0
    MAX: int = 5

    # 생성자: 캡슐화하여 외부에서 함부로 바꿀 수 없게 설정
    def __init__(self, name: str) -> None:
        self._name = name
        self._borrowed = 0
        Borrower.total += 1   # 대출을 할 때마다 클래스 속성 대출자 수 복합연산

    # 대출 심사 후 대출이 유효한지 확인
    def borrow(self, n: int) -> bool:
        """대출 유효성을 심사합니다."""
        if self._borrowed + n > Borrower.MAX:
            return False
        self._borrowed += n
        return True

    # 총 대출자 수를 getter로 반환합니다.
    @classmethod
    def get_total(cls) -> int:
        """총 대출자 수를 읽습니다."""
        return cls.total

    # 현재 대출관리 객체의 상태를 반환합니다.
    def to_info(self) -> str:
        """{name}: {borrowed}/{MAX}권 형식으로 반환합니다."""
        return f"{self._name}: {self._borrowed}/{type(self).MAX}권"
        

# ---- 호출부 (수정 금지) ----
members = {}
for cmd in commands:
    if cmd[0] == "new":
        members[cmd[1]] = Borrower(cmd[1])
        print("등록:", cmd[1])
    elif cmd[0] == "borrow":
        print(members[cmd[1]].borrow(int(cmd[2])))
    else:
        print(members[cmd[1]].to_info())
print(Borrower.get_total())
print(Borrower.total == len(members), any("total" in m.__dict__ for m in members.values()), Borrower.MAX)