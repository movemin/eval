# 함수 정의
def count_vowels(word: str) -> int:
    """단어를 입력하시면 알파벳 모음의 개수가 반환됩니다.
    
    Args:
        word (str): 단어
    Returns:
        int: 모음의 개수
    Examples:
        >>> count_vowels('hello')
            2
        >>>count_vowels('aeiou')
            5
        >>>count_vowels('xyz')
            0
    """
    return sum(char in "aeiou" for char in word)  # Python 관례대로 작성


# input() 으로 단어 한 줄 입력받기
word = input()

# 함수를 호출하여 결과값 출력
print(count_vowels(word))