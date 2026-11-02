# 한 줄에 이름들이 공백으로 구분되어 있습니다. 예: "kim lee" -> ["kim", "lee"]
names = input().split()


class Student:
    count = 0

    def __init__(self, name):
        self.name = name
        Student.count += 1                  # 클래스 속성을 직접 증가시켜 인스턴스 속성 생성을 방지
        self.uid = f"S{Student.count:03d}"  # 클래스 속성 값으로 학번 생성

    @classmethod
    def total(cls):
        return cls.count


# ---- 호출부 (수정 금지) ----
students = [Student(name) for name in names]
for s in students:
    print(s.uid, s.name)
print(Student.total())
print(students[0].count == Student.count, "count" in students[0].__dict__)