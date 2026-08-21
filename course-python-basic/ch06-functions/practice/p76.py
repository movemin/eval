# 함수 정의
def reverse(word: str) -> str:
    """
    단어를 입력하시면 문자열을 뒤집어서 반환합니다.

    Args:
        word (str): 단어
    Returns:
        str: 뒤집힌 단어
    Examples:
        >>> reverse('hello')
            'olleh'
        >>> reverse('a')
            'a'
        >>> reverse('12345')
            '54321'
        >>> reverse('')  # 빈 문자열도 빈 문자열 반환
            ''
    """
    return word[::-1]  # 인덱스 슬라이싱으로 간결하게 반환

# 모듈로 재사용될 때 아래 코드가 실행되지 않도록 가드 추가
if __name__ == '__main__':
    # input() 으로 문자열 한 줄을 읽습니다.
    word = input()

    # 함수 호출 및 결과값 출력
    print(reverse(word))