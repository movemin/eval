# 함수 정의
def ranking(category: str, *names: str) -> str:
    """카테고리와 항목의 이름을 입력하시면
    '카테고리: 항목1 > 항목2 > ... > 항목n' 형태의 문자열이
    순위를 나열하며 반환됩니다.
    
    Args:
        category (str): 카테고리
        *names (str): 순위를 매길 항목들 (1개 이상)
    Returns:
        str: 카테고리의 항목(들)
    Examples:
        >>> ranking('선호도', '사과', '바나나', '포도')
        '선호도: 사과 > 바나나 > 포도'
        >>> ranking('1위', '김철수')
        '1위: 김철수'
        >>> ranking('순위', 'A', 'B')
        '순위: A > B'
    """
    return f"{category}: {' > '.join(names)}"


# 첫 토큰=카테고리, 나머지=항목들. 예: "선호도 사과 바나나" → category="선호도", names=["사과","바나나"]
raw = input().split()
category = raw[0]
names = raw[1:]

# ↓ 호출부 (수정하지 마세요)
print(ranking(category, *names))