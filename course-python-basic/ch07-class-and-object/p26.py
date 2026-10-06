# 한 줄에 이름들이 공백으로 구분되어 있습니다. 예: "kim lee park" -> ["kim", "lee", "park"]
names = input().split()


# 회원 수 집계 클래스
class Member:
    """회원정보를 관리합니다."""

    # 카운트는 클래스 속성으로 설정하여 각 객체가 공유할 수 있도록 설정
    count = 0

    # 생성자
    def __init__(self, name):
        if not isinstance(name, str) or name == '':
            raise TypeError("문자열의 이름을 입력하여 주세요.")
        self._name = name             # 캡슐화하여 보호
        type(self).count += 1         # 서브클래스에서도 올바르게 동작
        self._no = type(self).count   # 캡슐화하여 보호
    
    # 클래스 메서드: 클래스·인스턴스 양쪽에서 호출 가능
    @classmethod
    def total(cls):
        """회원 수를 반환합니다."""
        return cls.count

    # 비파괴적 이념 -> 변수답게 반환할 수 있도록 선언
    @property
    def name(self):
        return self._name

    @property
    def no(self):
        return self._no
    
    # 회원 정보
    def intro(self):
        """회원 번호와 이름을 반환합니다."""
        return f"{self.no}번 회원 {self.name}"


# ---- 호출부 (수정 금지) ----
print(Member.total())                 # 가입 전 — 클래스로 호출
members = [Member(name) for name in names]
for m in members:
    print(m.intro())
print(Member.total())                 # 클래스로 호출
print(members[-1].total())            # 인스턴스로 호출 — 같은 값
print(Member.total() == members[0].total() == len(members))