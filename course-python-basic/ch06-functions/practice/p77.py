# 함수 정의
def is_palindrome(word: str) -> bool:
    """회문을 판별하여 맞으면 True, 아니면 False를 반환하는 함수입니다.

    Args:
        word (str): 판별할 문자열
    Returns:
        bool: 회문이면 True, 아니면 False
    Examples:
        >>> is_palindrome('racecar')
            True
        >>> is_palindrome('hello')
            False
        >>> is_palindrome('a')
            True
    """
    return word == word[::-1]  # 비교연산자를 사용함으로써 불린형을 간결하게 반환


# 모듈로 재사용시 의도하지 않은 출력값이 나오지 않게 하기 위한 가드
if __name__ == '__main__':
    # input() 으로 문자열 한 줄을 읽습니다. 예: 입력이 "racecar" 이면 word == "racecar"
    word = input()

    # 함수 호출 및 결과값 출력
    print(is_palindrome(word))