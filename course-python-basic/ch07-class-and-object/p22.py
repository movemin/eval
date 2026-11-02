# 첫 줄: 팀 수 n. 이어지는 n 줄: "팀이름 멤버1 멤버2 ..." (예: "red kim lee" -> ["red", "kim", "lee"])
n = int(input())
rows = [input().split() for _ in range(n)]


# 팀과 멤버를 관리하는 목록 클래스
class Team:
    """팀과 멤버를 관리하는 목록"""

    # 등록된 팀은 클래스 메모리에 관리하여 각 객체를 호출해도 모든 팀들의 목록이 호출될 수 있도록 설계
    all_teams = []

    # 생성자: 이름과 각 팀의 멤버를 관리하고, 생성 때마다 각 팀의 이름을 클래스 메모리에 추가
    def __init__(self, name: str) -> None:
        self.name = name
        self.members = []
        Team.all_teams.append(self.name)
    
    # 멤버 추가
    def add_member(self, member: str) -> None:
        """각 팀에 멤버를 추가합니다."""
        self.members.append(member)

    # 멤버 수 호출 메서드
    def size(self) -> int:
        """각 팀의 멤버 수를 반환합니다."""
        return len(self.members)


# ---- 호출부 (수정 금지) ----
teams = []
for row in rows:
    t = Team(row[0])
    for member in row[1:]:
        t.add_member(member)
    teams.append(t)
print(Team.all_teams)
for t in teams:
    print(t.name, t.size(), t.members)
print("all_teams" in teams[0].__dict__, "members" in teams[0].__dict__)