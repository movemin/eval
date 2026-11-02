# 첫 줄: 강아지 수 n. 이어지는 n 줄: "이름 나이" (예: "바둑이 3" -> ["바둑이", "3"])
n = int(input())
rows = [input().split() for _ in range(n)]

# 강아지 클래스 작성
class Dog:
    """강아지의 이름과 나이, 소리를 표현하는 객체입니다."""

    # 생성자: 강아지 이름 및 나이 저장
    def __init__(self, name: str, age: int) -> None:
        # 나이 유효성 검사
        if age < 0:
            raise ValueError("나이는 0을 포함한 양수의 정수를 입력하셔야 합니다.")
        self.name = name
        self.age = age

    # 강아지 짖는 소리
    def bark(self) -> str:
        return f"{self.name}: 멍멍"

    # 사람 나이로 변환하는 메서드
    def human_age(self) -> int:
        return self.age * 7

    # string 강제 변환 메서드
    def __str__(self) -> str:
        return f"이름: {self.name}\n나이: {self.age}"

    # 디버깅 시 확인하는 메서드
    def __repr__(self) -> str:
        return f"Dog(name={self.name!r}, age={self.age})"

# ---- 호출부 (수정 금지) ----
for dog_name, dog_age in rows:
    dog = Dog(dog_name, int(dog_age))
    print(dog.bark())
    print(f"{dog.name} {dog.age}살 = 사람 나이 {dog.human_age()}살")