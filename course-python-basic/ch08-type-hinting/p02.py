from typing import get_type_hints

# 첫 줄: 정수들 (예: "1 2 3 4" -> [1, 2, 3, 4], 빈 줄이면 []). 둘째 줄: 단어들 (예: "apple pear apple")
nums = [int(t) for t in input().split()]
words = input().split()

def total(xs: list[int]) -> int:
    """정수 리스트의 합을 반환한다. 빈 리스트면 0."""
    return sum(xs)

# 타입 힌트를 넣어 유지보수시 원인파악 신속성 향상
def count_words(words: list[str]) -> dict[str, int]:
    """단어별 등장 횟수를 삽입 순서 유지 딕셔너리로 반환한다."""
    word_counts = {}
    for word in words:
        word_counts[word] = word_counts.get(word, 0) + 1
    return word_counts

# 타입 힌트 및 람다를 사용해 리턴문 간결하고 가독성 있게 사용
def evens(xs: list[int]) -> tuple[int, ...]:
    """짝수만 골라 튜플로 반환한다. 없으면 빈 튜플."""
    return tuple(filter(lambda x: not x % 2, xs))

# ---- 호출부 (수정 금지) ----
print(total(nums))
print(count_words(words))
print(evens(nums))
h = get_type_hints(total)
print(h.get("xs") == list[int], h.get("return") is int)
h = get_type_hints(count_words)
print(h.get("words") == list[str], h.get("return") == dict[str, int])
h = get_type_hints(evens)
print(h.get("xs") == list[int], h.get("return") == tuple[int, ...])