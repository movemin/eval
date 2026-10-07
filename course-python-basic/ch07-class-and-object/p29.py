# 첫 줄: 강좌명들 (쉼표 구분). 둘째 줄: 새 학교 이름
titles = input().split(",")
new_school = input().strip()


class Course:
    school = "YJU"

    def __init__(self, title):
        self.title = title

    def info(self):        # self는 클래스 속성도 접근 가능: 매개변수로 받은 인스턴스가 없으면 클래스 자동 참조
        return f"{self.school} {self.title}"

    @classmethod
    def school_name(cls):  # 올바른 클래스 메서드 — 수정 불필요
        return cls.school


# ---- 호출부 (수정 금지) ----
courses = [Course(t) for t in titles]
for c in courses:
    print(c.info())
print(Course.school_name())
Course.school = new_school                         # 클래스 속성 변경 → 모든 강좌에 반영되어야 한다
for c in courses:
    print(c.info())
print(Course.school_name())