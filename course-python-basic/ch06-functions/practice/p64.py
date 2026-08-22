# ---함수 정의---
def greet(name: str) -> str:
    """이름으로 인사말을 만든다.

        Args:
            name (str): 인사할 이름
        Returns:
            str: 완성된 인사말
    """
    return f"안녕하세요, {name}님!"

# ---다른 코드에서 import시 오류 방지 ---
# if __name__ == '__main__':  # 현재 코드에서 실행될 때만 실행

    # ---파라미터의 넣을 이름(인자값) 입력받기---
    name = input()

    # ---함수 docstring 반환값 출력---
    print(greet.__doc__)

    # ---함수 호출하여 출력---
    print(greet(name))