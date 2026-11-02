# 첫 줄: 값의 개수 n. 이어지는 n 줄: "int 5" -> 5, "str hello" -> "hello", "list 1 2 3" -> [1, 2, 3], "list" -> []
n = int(input())
values = []
for _ in range(n):
    kind, *rest = input().split()
    if kind == "int":
        values.append(int(rest[0]))
    elif kind == "str":
        values.append(rest[0])
    else:
        values.append([int(x) for x in rest])


# 타입별 출력기
class Printer:

    # 클래스 메서드로 선언하여 클래스나 인스턴스 어느 쪽이든 구애받지 않고 값을 반환할 수 있도록 설계
    @staticmethod
    def show(value):
        """매개변수의 타입별로 다른 문자열을 반환합니다."""

        # 인스턴스 검사 메서드로 매개변수의 타입을 구분하기
        if isinstance(value, int):
            return f"정수 {value}"
        elif isinstance(value, str):
            return f"문자열 '{value}'"
        elif isinstance(value, list):
            return f"목록 {len(value)}개 합 {sum(value)}"
        else:
            raise TypeError("지원하지 않는 타입입니다.")


# ---- 호출부 (수정 금지) ----
p = Printer()
for i, v in enumerate(values):
    if i % 2 == 0:
        print(Printer.show(v))      # 클래스 이름으로 호출
    else:
        print(p.show(v))            # 인스턴스로 호출