# 함수 정의
def concat_words(*words: str) -> str:
    """단어 리스트를 인자값으로 받아 
    '-'구분자로 하여 이어붙여서 반환합니다.
    
    Args:
        words (str): 이어붙일 대상인 문자
    Returns:
        str: '-'로 이어붙여진 문자
    Examples:
        >>> concat_words('a', 'b', 'c')
        'a-b-c'
        >>> concat_words('hello')
        'hello'
        >>> concat_words('x', 'y')
        'x-y'
        >>> concat_words('one', 'two', 'three', 'four')
        'one-two-three-four'
    """
    return "-".join(words)  # 내장 str 메서드로 간결하게 작성


# 입력을 단어 리스트로 만듭니다. 예: "a b c" → words=["a", "b", "c"]
words = input().split()

# ↓ 호출부 (수정하지 마세요)
print(concat_words(*words))