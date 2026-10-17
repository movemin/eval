from typing import Final, ClassVar, get_type_hints

# 첫 줄: 최대 제출 횟수, 둘째 줄: 응답자 이름들
max_value: int = int(input())
names: list[str] = input().split()


# 이 변수에 다시 대입하지 않겠다 선언
MAX_SUBMIT: Final[int] = max_value


# 클래스 설계
class Response:
    """온라인 퀴즈 시스템 응답 제출 관리 클래스

    Attributes:
        count (int): 전체 응답 수 (클래스 소유)
    """

    count: ClassVar[int] = 0

    # 생성자
    def __init__(self, student: str) -> None:
        self.student = student
        Response.count += 1
        self.no = Response.count
    
    # 응답 반환
    def info(self) -> str:
        """응답 순번과 학생 이름을 포맷팅하여 반환한다."""
        return f"{self.no}번째 응답: {self.student}"


# ---- 호출부 (수정 금지) ----
print("최대 제출 횟수:", MAX_SUBMIT)
responses = [Response(name) for name in names]
for r in responses:
    print(r.info())
print("전체 응답 수:", Response.count)
# 응답 수 집계가 객체가 아니라 클래스에 저장되는지 확인합니다.
print("count는 첫 응답 객체의 인스턴스 속성인가:", "count" in responses[0].__dict__)
print("count는 Response의 클래스 속성인가:", "count" in Response.__dict__)
print("MAX_SUBMIT 힌트가 Final[int]인가:", __annotations__.get("MAX_SUBMIT") == Final[int])
h = get_type_hints(Response)
print("count 힌트가 ClassVar[int]인가:", h.get("count") == ClassVar[int])
h = get_type_hints(Response.__init__)
print("__init__의 student 힌트와 반환 힌트 (str, None):", h.get("student") is str, h.get("return") is type(None))