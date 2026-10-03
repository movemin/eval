# 한 줄: "선수1 선수2 개인팀 새기본팀" (예: "kim lee KAIST SNU")
name1, name2, personal, new_team = input().split()


# 소속팀 선수 관리 클래스. 팀과 선수이름으로 추상화
class Player:
    """선수 이름과 소속팀을 관리하는 클래스"""

    # 소속팀 선수 -> 클래스메서드로 관리
    team = "YJU"

    # 생성자
    def __init__(self, name):
        self.name = name

    def intro(self) -> str:
        """선수 이름과 소속팀을 반환합니다."""
        # self.team: 인스턴스 속성이 있으면 그 값, 없으면 클래스 속성을 조회
        return f"{self.name}({self.team})"


# ---- 호출부 (수정 금지) ----
p1 = Player(name1)
p2 = Player(name2)
print(p1.intro(), p2.intro())
print("team" in p1.__dict__, "team" in p2.__dict__)
p1.team = personal                       # ① p1 에만 대입 → 클래스 속성이 가려진다
print(p1.intro(), p2.intro())            # 가려진 상태: p1 은 개인 팀, p2 는 클래스 값
print(p1.team, p2.team, Player.team)
print("team" in p1.__dict__, "team" in p2.__dict__)
del p1.team                              # ② 가림을 걷어낸다
print(p1.intro(), p2.intro())
Player.team = new_team                   # ③ 클래스 속성 변경 → 모든 선수에게 반영
print(p1.team, p2.team, Player.team)