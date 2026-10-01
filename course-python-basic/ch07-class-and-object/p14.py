# 첫 줄: 시작값 start. 둘째 줄: 호출 방식 목록 (예: "obj cls obj" -> ["obj", "cls", "obj"])
start = int(input())
hows = input().split()

# 카운터 클래스
class Counter:
    """카운트를 해주는 클래스"""

    # 생성자
    def __init__(self, count):
        self._count = count

    # 읽기 전용 -> .변수만으로 읽을 수 있도록 하기
    @property
    def count(self):
        return self._count   # 읽기 전용이므로 객체의 인스턴스 변수 지키기

    # 셋터
    @count.setter
    def count(self, value):
        if not isinstance(value, int):
            raise ValueError("정수형을 입력하여 주세요")
        self._count = value

    # 카운트 누적하는 메서드
    def inc(self):
        """카운트 1 더하기"""
        self._count += 1
        return self._count

    # 현재 카운트를 보여주는 메서드
    def value(self):
        """현재 카운트를 반환합니다."""
        return self._count

    # 사용자 친화적 출력 (디버깅용 __repr__과 역할 분리)
    def __str__(self):
        return f"Counter: {self._count}"

    # 디버깅시 상태 확인
    def __repr__(self):
        return f"Counter({self._count})"

    # + 연산자 사용 가능하도록 설계
    def __add__(self, value):
        if not isinstance(value, int):
            raise ValueError("정수형을 입력하여 주세요")
        return Counter(self.count + value)


# ---- 호출부 (수정 금지) ----
c = Counter(start)
for how in hows:
    if how == "obj":
        print("c.inc() ->", c.inc())               # 인스턴스로 호출
    else:
        print("Counter.inc(c) ->", Counter.inc(c))  # 클래스로 호출 (객체를 첫 인자로 직접 전달)
print("value:", c.value())
print(c.value() == Counter.value(c))