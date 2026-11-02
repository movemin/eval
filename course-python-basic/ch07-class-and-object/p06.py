# 첫 줄: 학생 수 n. 이어지는 n 줄: "이름 점수" (예: "kim 95" -> ["kim", "95"])
n = int(input())
rows = [input().split() for _ in range(n)]

# Student 설계도
class Student:
    """학생의 이름과 점수를 가지고, 성적 등급을 메서드로 반환하는 설계도"""

    # 성적과 점수 범위 딕셔너리를 클래스 메모리로 관리하여 유지보수 용이성 향상
    GRADE_THRESHOLDS = [(90, "A"), (80, "B"), (70, "C")]
    
    # 생성자: 초기화시 매개변수가 동시에 들어갈 수 있도록 __init__ 특별함수 사용
    def __init__(self, name, score):
        # 유효성 검사
        if not 0 <= score <= 100:
            raise ValueError("점수는 0에서 100 사이의 정수를 입력하셔야 합니다.")
        self.name = name
        self.score = score

    # 등급 메서드
    def grade(self):
        # 클래스 메모리에 있는 리스트를 사용하여 등급 산출
        for threshold, letter in self.GRADE_THRESHOLDS:
            if self.score >= threshold:
                return letter
        # 조기 리턴을 사용
        return "F"
    
    # print나 str 등에 객체가 매개변수로 들어갈 시 바뀌는 문자열 형태 지정
    def __str__(self):
        return f"{self.name} {self.score} {self.grade()}"

    # __repr__: 개발/디버깅 환경에서 객체를 명확히 표현
    def __repr__(self):
        return f"Student(name={self.name!r}, score={self.score}"
    
# ---- 호출부 (수정 금지) ----
for name, score in rows:
    s = Student(name, int(score))
    print(f"{s.name} {s.score} {s.grade()}")