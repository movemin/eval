# 함수 정의
def report(label: str, *scores: int) -> str:
    """라벨에 이어 점수의 합계가 문자열 형태로 나옵니다.
    
    Args:
        label (str): 과목 라벨
        scores (int): 점수(들)
    Returns:
        str: '라벨: 점수의 합'
    Examples:
        >>> report('수학', 90, 80, 70)
        '수학: 240'
        >>> report('영어', 100)
        '영어: 100'
        >>> report('과학')
        '과학: 0'
    """
    return f"{label}: {sum(scores)}"  # sum에 인자가 없으면 0으로 나온다.


# 첫 토큰=라벨(label), 나머지=점수들. 예: "수학 90 80 70" → label="수학", scores=[90, 80, 70]
parts = input().split()
label = parts[0]
scores = [int(x) for x in parts[1:]]

# ↓ 호출부 (수정하지 마세요) — label 은 위치 인자, 나머지는 * 로 풀어 전달
print(report(label, *scores))