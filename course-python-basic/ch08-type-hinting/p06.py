from collections.abc import Sequence
from typing import get_type_hints

_SEQ_INT = Sequence[int]                 # 호출부가 사용하는 검사 기준입니다. 수정하지 마세요.


# 순서가 있는 정수 시퀀스(리스트·튜플·range)를 받아 합계를 반환하는 함수
def total_score(scores: Sequence[int]) -> int:
    """점수 합계 반환"""
    return sum(scores)


def top_score(scores: Sequence[int]) -> int:
    """최고 점수 반환"""
    return max(scores)


# 첫 줄: 리스트로 모은 점수들, 둘째 줄: 튜플로 모은 점수들, 셋째 줄: range 범위 끝 정수 n
score_list = [int(x) for x in input().split()]
score_tuple = tuple(int(x) for x in input().split())
n = int(input())


# ---- 호출부 (수정 금지) ----
print("리스트 응답 합계:", total_score(score_list))
print("튜플 응답 합계:", total_score(score_tuple))
print(f"1부터 {n}까지 range 합계:", total_score(range(1, n + 1)))
print("리스트 최고 점수:", top_score(score_list))
# 세 종류의 입력이 모두 동작하더라도, 힌트가 Sequence[int]로 선언되었는지는 따로 확인합니다.
h = get_type_hints(total_score)
print("total_score의 scores 힌트가 Sequence[int]인가:", h.get("scores") == _SEQ_INT)
print("total_score의 반환 힌트가 int인가:", h.get("return") is int)
h = get_type_hints(top_score)
print("top_score의 scores 힌트가 Sequence[int]인가:", h.get("scores") == _SEQ_INT)
print("top_score의 반환 힌트가 int인가:", h.get("return") is int)