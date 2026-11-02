from typing import Literal, get_type_hints

# 한 줄: 정수들
nums = [int(t) for t in input().split()]


def arrange(nums: list[int], order: Literal["asc", "desc"]) -> list[int]:
    """order가 desc 일 경우 nums 내림차순 반환, 그 외는 오름차순 반환"""
    # order == "desc" 이면 True → reverse=True, 아니면 False → 오름차순
    return sorted(nums, reverse=order == "desc")


# ---- 호출부 (수정 금지) ----
print("오름차순:", arrange(nums, "asc"))
print("내림차순:", arrange(nums, "desc"))
h = get_type_hints(arrange)
print("nums 힌트가 list[int]인가:", h.get("nums") == list[int])
print('order 힌트가 Literal["asc", "desc"]인가:', h.get("order") == Literal["asc", "desc"])
print("반환 힌트가 list[int]인가:", h.get("return") == list[int])