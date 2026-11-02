# 방문자를 카운터하는 설계도입니다.
class Visitor:

    # total: 클래스 공유 방문자 수 (Java의 static 변수에 해당)
    total = 0

    # 생성자는 이름을 입력할 때 인스턴스 속성 업데이트 및 클래스 속성 total 카운트 및 각 객체 속성인 number 업데이트
    def __init__(self, name):
        self._name = name
        Visitor.total += 1
        self._number = Visitor.total

    # 클래스 속성을 가져올 수 있도록 설정
    @classmethod
    def get_total(cls):
        return cls.total

    # 가독성을 위해 f-string 메서드 사용
    def greet(self):
        return f"{self._name}님, {self._number}번째 방문자입니다"


# 한 줄에 이름들이 공백으로 구분되어 있습니다.
names = input().split()


# ---- 호출부 (수정 금지) ----
visitors = [Visitor(name) for name in names]
for v in visitors:
    print(v.greet())
print(Visitor.get_total())
print(Visitor.total == len(visitors), "total" in visitors[0].__dict__)